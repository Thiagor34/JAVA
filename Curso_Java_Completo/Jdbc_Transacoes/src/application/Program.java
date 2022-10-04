package application;

import db.DB;
import db.DbException;

import java.sql.*;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stat = null;

        try {
            conn = DB.getConnection();
            conn.setAutoCommit(false);              //Não vai confirmar automáticamente as operações.
            stat = conn.createStatement();

            int rows1 = stat.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            int x = 1;
            /*if (x < 2) {
                throw new SQLException("Fake Error");
            }*/

            int rows2 = stat.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit();                          //Agora sim ele vai confirmar as operações

            System.out.println("rows1 " + rows1);
            System.out.println("rows2 " + rows2);


        } catch (SQLException e) {
            try {
                conn.rollback();                        //Caso de problema, volta ao estado inicial do banco
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! Caused by: " + ex.getMessage());
            }
        } finally {
            DB.closeStatement(stat);
            DB.closeConnection();
        }
    }
}
