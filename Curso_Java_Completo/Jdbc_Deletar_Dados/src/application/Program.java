package application;

import db.DB;
import db.DbIntegrityException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pStat = null;

        try {
            conn = DB.getConnection();
            pStat = conn.prepareStatement("DELETE FROM department "
                    + " WHERE Id = ? ");

            pStat.setInt(1, 2);

            int rowsAffected = pStat.executeUpdate();
            System.out.println("Done! Rows Affected: " + rowsAffected);

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(pStat);
            DB.closeConnection();
        }
    }
}
