package br.com.senac.dao;

import br.com.senac.entidade.Usuario;
import java.util.List;
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
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        usuario = new Usuario(Gerador.gerarNome(), Gerador.gerarLogin(), Gerador.gerarSenha(6));
        usuarioDAO.salvar(usuario);
        assertNotNull(usuario.getId());
    }

    @Test
    public void testAlterar() throws Exception {
        System.out.println("alterar");
    }

    @Test
    public void testExcluir() throws Exception {
        System.out.println("excluir");
    }

    @Test
    public void testPesquisarPorId() throws Exception {
        System.out.println("pesquisarPorId");
    }

    @Test
    public void testPesquisarTudo() throws Exception {
        System.out.println("pesquisarTudo");
    }

    @Test
    public void testPesquisarPorNome() throws Exception {
        System.out.println("pesquisarPorNome");
    }

}
