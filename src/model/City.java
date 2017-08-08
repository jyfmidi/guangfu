package model;

import java.sql.*;

public class City {
    public int id;
    public String city;
    public float score;
    public float X;
    public float Y;

    public String basic_info_province;
    public float basic_info_altitude;
    public int basic_info_resource_type;
    public float basic_info_elec_price;

    public float radar_sunshine;
    public float radar_land_price;
    public float radar_abandon;
    public float radar_GDP;

    public String x_info;
    public String y_info;
    public String z_info;

    public String gc_info;
    public String benefit_info;
    public String fluc_info;

    public float cost_modules;
    public float cost_construction;
    public float cost_land;
    public String cost_info;
    public float payback_period_cbd;
    public float payback_period_s_f;
    public float payback_period_s_o;
    public float payback_period_s_d;
    public float payback_period_m_f;
    public float payback_period_m_o;
    public float payback_period_m_d;
    public String payback_info;

    public String[] near;

    public void makeCity(ResultSet rs) {
        try {
            this.id = rs.getInt("id");
            this.city = rs.getString("city");
            this.score = rs.getFloat("score");
            this.X = rs.getFloat("X");
            this.Y = rs.getFloat("Y");
            this.basic_info_province = rs.getString("basic_info_province");
            this.basic_info_altitude = rs.getFloat("basic_info_altitude");
            this.basic_info_resource_type = rs.getInt("basic_info_resource_type");
            this.basic_info_elec_price = rs.getFloat("basic_info_elec_price");
            this.radar_sunshine = rs.getFloat("radar_sunshine");
            this.radar_land_price = rs.getFloat("radar_land_price");
            this.radar_abandon = rs.getFloat("radar_abandon");
            this.radar_GDP = rs.getFloat("radar_GDP");
            this.x_info = rs.getString("x_info");
            this.y_info = rs.getString("y_info");
            this.z_info = rs.getString("z_info");
            this.gc_info = rs.getString("gc_info");
            this.benefit_info = rs.getString("benefit_info");
            this.fluc_info = rs.getString("fluc_info");
            this.cost_modules = rs.getFloat("cost_modules");
            this.cost_construction = rs.getFloat("cost_construction");
            this.cost_land = rs.getFloat("cost_land");
            this.cost_info = rs.getString("cost_info");
            this.payback_period_cbd = rs.getFloat("payback_period_cbd");
            this.payback_period_s_f = rs.getFloat("payback_period_s_f");
            this.payback_period_s_o = rs.getFloat("payback_period_s_o");
            this.payback_period_s_d = rs.getFloat("payback_period_s_d");
            this.payback_period_m_f = rs.getFloat("payback_period_m_f");
            this.payback_period_m_o = rs.getFloat("payback_period_m_o");
            this.payback_period_m_d = rs.getFloat("payback_period_m_d");
            this.payback_info = rs.getString("payback_info");
            String[] near = new String[6];
            near[0] = rs.getString("near1");
            near[1] = rs.getString("near2");
            near[2] = rs.getString("near3");
            near[3] = rs.getString("near4");
            near[4] = rs.getString("near5");
            near[5] = rs.getString("near6");
            this.near = near;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String json() {
        String json = "{name:\'" + this.city + "\'," +
                "altitude:" + this.basic_info_altitude + "," +
                "elePrice:" + this.basic_info_elec_price + "," +
                "province:\'" + this.basic_info_province + "\'," +
                "latitude:" + this.X + "," +
                "longitude:" + this.Y + "," +
                "type:" + this.basic_info_resource_type + "," +
                "fz:\"" + this.x_info + "\"," +
                "dj:\"" + this.y_info + "\"," +
                "qgl:\"" + this.z_info + "\"," +
                "gdp:\"" + this.gc_info + "\"," +
                "fd:\"" + this.benefit_info + "\"," +
                "bdl:\"" + this.fluc_info + "\"," +
                "cb:\"" + this.cost_info + "\"," +
                "hsqx:\"" + this.payback_info + "\"," +
                "zj:" + this.cost_modules + "," +
                "sg:" + this.cost_construction + "," +
                "td:" + this.cost_land + "," +
                "singlegd:" + this.payback_period_s_f + "," +
                "singlexdz:" + this.payback_period_s_o + "," +
                "singlesz:" + this.payback_period_s_d + "," +
                "multigd:" + this.payback_period_m_f + "," +
                "multixdz:" + this.payback_period_m_o + "," +
                "multisz:" + this.payback_period_s_d + "," +
                "radar:[" + this.radar_sunshine + "," + this.radar_land_price + "," + this.radar_abandon + "," + radar_GDP + "]}";
        return json;
    }
}
