package application;

import db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stat = null;
        ResultSet res = null;

        try {
            conn = DB.getConnection();
            stat = conn.createStatement();
            res = stat.executeQuery("SELECT * FROM department");

            while (res.next()) {
                System.out.println(res.getInt("Id") + ", " + res.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeResultSet(res);
            DB.closeStatement(stat);
            DB.closeConnection();
        }
    }
}
