package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = null;
        PreparedStatement pStat = null;

        try {
            conn = DB.getConnection();
            pStat = conn.prepareStatement("UPDATE seller "
                    + " SET BaseSalary = BaseSalary + ? "
                    + " WHERE (DepartmentId = ?)");

            pStat.setDouble(1, 200.00);
            pStat.setInt(2, 2);

            int rowsAffected = pStat.executeUpdate();
            System.out.println("Done! Rows Affected: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(pStat);
            DB.closeConnection();
        }
    }
}
