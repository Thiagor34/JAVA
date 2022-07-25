package jdbc;

import java.sql.*;

public class ConnectionManager {

    private static final String USUARIO_BD = "root";
    private static final String SENHA_BD = "dani1812";
    private static final String NOME_BANCO = "senac";
    private static final String STR_TIMEZONE = "?useTimezone=true&serverTimezone=America/Sao_Paulo&zeroDateTimeBehavior=convertToNull";
    private static final String STR_CON = "jdbc:mysql://localhost:3306/" + NOME_BANCO + STR_TIMEZONE;

    public static Connection abrirConexao() throws Exception {
        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(STR_CON, USUARIO_BD, SENHA_BD);
            System.out.println("Conectado ao Banco");
        } catch (SQLException e) {
            throw new Exception("Driver não encontrado: " + e.getMessage(), e);
        } catch (Exception e) {
            throw new Exception("Erro ao obter conexão : " + e.getMessage(), e);
        }
        return conexao;
    }

    public static void fechar(Connection connection, Statement statement, ResultSet resultSet) throws Exception {
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
            throw new Exception(ex.getMessage());
        }
    }

    public static void fechar(Connection connection, Statement statement) throws Exception {
        fechar(connection, statement, null);

    }

    public static void fechar(Connection connection) throws Exception {
        fechar(connection, null, null);
    }

}
