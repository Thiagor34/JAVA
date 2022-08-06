package br.com.senac.dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection abrirConexao() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + "prego"
                    + "?useTimezone=true&serverTimezone=UTC", "root", "dani1812");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro no drive do MySql");
        }
        return null;
    }
    
    public static void fecharConexao(Connection connection, Statement statement, ResultSet resultSet) throws SQLException{
        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
            System.out.println("Conexão fechada");
        } catch (SQLException ex) {
            System.out.println("Erro de driver Sql");
        }
    }

    public static void fecharConexao(Connection connection, Statement statement) throws SQLException {
        fecharConexao(connection, statement, null);

    }

    public static void fecharConexao(Connection connection) throws SQLException {
        fecharConexao(connection, null, null);
    }

}
