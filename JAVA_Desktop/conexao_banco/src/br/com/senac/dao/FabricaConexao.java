package br.com.senac.dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection abrirConexao() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + "wdesktop"
                    + "?useTimezone=true&serverTimezone=UTC", "root", "!!1234!!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro no drive do MySql");
        }
        return null;
    }

    public static void fecharConexao(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
        try {

            if (resultSet != null) {
                resultSet.close();
            }

            connection.close();
            statement.close();

            System.out.println("Conexão fechada");
        } catch (SQLException ex) {
            System.out.println("Erro de driver Sql");
        }
    }

}
