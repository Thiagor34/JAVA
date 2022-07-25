package jdbc;

import java.sql.Connection;

public class TesteConexao {

    public static void main(String[] args) {
        try {
            Connection conexao = ConnectionManager.abrirConexao();
            conexao.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
