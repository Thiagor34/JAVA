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
            pStat = conn.prepareStatement("INSERT INTO seller "
                    + " (Name, Email, BirthDate, BaseSalary, DepartmentId) "
                    + "VALUES (?, ?, ?, ?, ?)",Statement.RETURN_GENERATED_KEYS);

            pStat.setString(1, "Thiago Costa");
            pStat.setString(2, "thiago@gmail.com");
            pStat.setDate(3, new java.sql.Date(sdf.parse("23/03/1987").getTime()));
            pStat.setDouble(4, 3000.00);
            pStat.setInt(5, 4);

            int rowsAffected = pStat.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet res = pStat.getGeneratedKeys();
                while (res.next()){
                    int id = res.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            } else {
                System.out.println("No rows Affected!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(pStat);
            DB.closeConnection();
        }
    }
}
