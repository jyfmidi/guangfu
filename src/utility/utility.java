package utility;

import model.City;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class utility {
    public static String database = "guangfu";
    public static String user = "root";
    public static String password = "123456";

    public static Connection getConnection() {
        // 驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/" + database + "?useUnicode=true&characterEncoding=UTF-8&useSSL=true";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            if (!conn.isClosed()) {
                return conn;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static City getCityByName(String tableId, String cityName) throws SQLException {
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "select * from `" + tableId + "`";
            sql += " where city = '" + cityName + "'";
            ResultSet rs = statement.executeQuery(sql);
            City city = new City();
            if (rs.next()) {
                city.makeCity(rs);
            }
            rs.close();
            connection.close();
            return city;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getNCityJson(String tableId, int number) throws SQLException {
        Connection connection = getConnection();
        try {
            String cityList = "[";
            Statement statement = connection.createStatement();
            String sql = "select * from `" + tableId + "`";
            sql += " limit " + number;
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                City city = new City();
                city.makeCity(rs);
                cityList += city.json() + ",";
            }
            cityList = cityList.substring(0, cityList.length() - 1) + "]";
            rs.close();
            connection.close();
            return cityList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getNearCityJson(String tableId, String name) throws SQLException {
        try {
            String cityList = "[";
            City city = getCityByName(tableId, name);
            String[] near = city.near;
            for (int i = 0; i < near.length; i++) {
                City temp = getCityByName(tableId,near[i]);
                cityList += temp.json()+",";
            }
            cityList = cityList.substring(0, cityList.length() - 1) + "]";
            return cityList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            City city = getCityByName("000", "上海");
            String list = getNCityJson("012", 10);
            String near = getNearCityJson("012","沱沱河");
            System.out.print(near);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
