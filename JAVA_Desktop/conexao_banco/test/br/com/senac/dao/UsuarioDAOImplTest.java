package br.com.senac.dao;

import br.com.senac.entidade.Usuario;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import util.Gerador;

public class UsuarioDAOImplTest {

    private Usuario usuario;
    private UsuarioDAO usuarioDAO;

    public UsuarioDAOImplTest() {
        usuarioDAO = new UsuarioDAOImpl();
    }

    @Test
    public void testSalvar() throws SQLException {
        System.out.println("salvar");
        usuario = new Usuario(Gerador.gerarNome(), Gerador.gerarLogin(), Gerador.gerarSenha(6));

        usuarioDAO.salvar(usuario);
        assertNull(usuario.getId());
    }

    @Test
    public void testAlterar() throws SQLException {
        System.out.println("alterar");
    }

    @Test
    public void testExcluir() throws Exception {
        System.out.println("excluir");
    }

    @Test
    public void testPesquisarPorId() throws Exception {
        System.out.println("pesquisarPorId");
        buscarUsuarioBD();
        Usuario usuarioPesquisado = usuarioDAO.pesquisarPorId(usuario.getId());
        System.out.println(usuario.toString());
        
        assertNotNull(usuarioPesquisado);
    }

    @Test
    public void testPesquisarTudo() throws Exception {
        System.out.println("pesquisarTudo");
    }

    @Test
    public void testPesquisarPorNome() throws Exception {
        System.out.println("pesquisarPorNome");
    }

    private Usuario buscarUsuarioBD() throws Exception {
        String sql = "SELECT * FROM usuario";
        Connection connection = FabricaConexao.abrirConexao();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet result = statement.executeQuery();

        if (result.next()) {
            usuario = new Usuario();
            usuario.setId(result.getInt("id"));
            usuario.setNome(result.getString("nome"));
            usuario.setLogin(result.getString("login"));
            usuario.setSenha(result.getString("senha"));
            usuario.setUltimoAcesso(result.getDate("ultimo_acesso"));
        } else {
            testSalvar();
        }
        return usuario;
    }

}
