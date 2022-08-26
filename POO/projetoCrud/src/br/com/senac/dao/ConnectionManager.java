package br.com.senac.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Objects;

public class ConnectionManager {

    private static final String USUARIO_BD = "root";
    private static final String SENHA_BD = "!!1234!!";
    private static final String NOME_BANCO = "senac";
    private static final String STR_TIMEZONE = "?useTimezone=true&serverTimezone=America/Sao_Paulo&zeroDateTimeBehavior=convertToNull";
    private static final String STR_CON = "jdbc:mysql://localhost:3306/" + NOME_BANCO + STR_TIMEZONE;

    public static Connection abrirConexao() throws SQLException {
        return DriverManager.getConnection(STR_CON, USUARIO_BD, SENHA_BD);
    }

    public static void fecharConexao(Connection conexao) throws SQLException {

        fecharConexao(conexao, null, null);
    }

    public static void fecharConexao(Connection conexao, Statement statement) throws SQLException {

        fecharConexao(conexao, statement, null);
    }

    public static void fecharConexao(Connection conexao, Statement statement, ResultSet resultado) throws SQLException {

        if (Objects.nonNull(conexao)) {
            conexao.close();
        }

        if (Objects.nonNull(statement)) {
            statement.close();
        }

        if (Objects.nonNull(resultado)) {
            resultado.close();
        }
    }
}
