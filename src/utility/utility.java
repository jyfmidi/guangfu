package utility;

import model.City;

import java.sql.*;

public class utility {
    public static String database = "guangfu";
    public static String user = "root";
    public static String password = "123456";

    public static Connection getConnection() {
        // 驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/" + database + "?useUnicode=true&characterEncoding=UTF-8";
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
            String sql = "select * from `"+tableId+"`";
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

    public static void main(String[] args) {
        try {
            City city = getCityByName("000","上海");
            System.out.print(city.json());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
