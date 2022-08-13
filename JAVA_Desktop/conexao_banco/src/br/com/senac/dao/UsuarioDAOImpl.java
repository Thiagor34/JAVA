package br.com.senac.dao;

import br.com.senac.entidade.Usuario;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;

public class UsuarioDAOImpl implements UsuarioDAO {

    private Connection connection;
    private PreparedStatement statement;
    private ResultSet result;

    @Override
    public void salvar(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario(nome, login, senha) VALUES (?, ?, ?)";

        try {
            connection = FabricaConexao.abrirConexao();
            statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, usuario.getNome());            
            statement.setString(2, usuario.getLogin());
            statement.setString(3, usuario.getSenha());

            statement.execute();

            result = statement.getGeneratedKeys();
            if (result.next()) {
                usuario.setId(result.getInt(1));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao salvar usuário " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(connection, statement, result);
        }
    }

    @Override
    public void alterar(Usuario usuario) throws SQLException {
    }

    @Override
    public void excluir(Integer id) throws SQLException {
    }

    @Override
    public Usuario pesquisarPorId(Integer id) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE id = ?";
        Usuario usuario = null;

        try {
            connection = FabricaConexao.abrirConexao();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            result = statement.executeQuery();
            
            if(result.next()) {
                usuario = new Usuario();
                usuario.setId(id);
                usuario.setNome(result.getString("nome"));
                usuario.setLogin(result.getString("login"));
                usuario.setSenha(result.getString("senha"));
                usuario.setUltimoAcesso(result.getDate("ultimo_acesso"));
            }
            
        } catch (SQLException e) {
            System.out.println("Erro ao pesquisar ID cliente " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(connection, statement, result);
        }
        return usuario;
    }

    @Override
    public List<Usuario> pesquisarTudo() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> pesquisarPorNome(String nome) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
