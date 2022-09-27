package br.com.senac.dao;

import br.com.senac.entidade.Usuario;
import br.com.senac.util.Gerador;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioDaoImplTest {

    private Usuario usuario;
    private UsuarioDao usuarioDao;
    private Session sessao;

    public UsuarioDaoImplTest() {
        usuarioDao = new UsuarioDaoImpl();
    }

    @Test
    public void testSalvar() {
        System.out.println("salvar");
        usuario = new Usuario(Gerador.gerarNome(), Gerador.gerarLogin() + Gerador.gerarNumero(3), Gerador.gerarSenha(5));

        sessao = HibernateUtil.abrirConexao();
        usuarioDao.salvarOuAlterar(usuario, sessao);
        sessao.close();

        assertNotNull(usuario.getId());
    }

    @Test
    public void testExcluir() {
        System.out.println("excluir");
        buscarUsuarioBD();
        sessao = HibernateUtil.abrirConexao();
        usuarioDao.excluir(usuario, sessao);

        Usuario usuarioExcluido = usuarioDao.pesquisarPorId(usuario.getId(), sessao);
        sessao.close();

        assertNull(usuarioExcluido);
    }

    @Test
    public void testAlterar() {
        System.out.println("alterar");
        buscarUsuarioBD();
        usuario.setNome(Gerador.gerarNome());
        sessao = HibernateUtil.abrirConexao();
        usuarioDao.salvarOuAlterar(usuario, sessao);
        sessao.close();

        sessao = HibernateUtil.abrirConexao();
        Usuario usuarioPesquisado = usuarioDao.pesquisarPorId(usuario.getId(), sessao);
        sessao.close();

        assertEquals(usuarioPesquisado.getNome(), usuario.getNome());
    }

    @Test
    public void testPesquisarTudo() {
        System.out.println("pesquisar Tudo");
        buscarUsuarioBD();
        sessao = HibernateUtil.abrirConexao();                              //abre conexão                 
        List<Usuario> usuarios = usuarioDao.pesquisarTodos(sessao);
        sessao.close();

        mostrarUsuario(usuarios);
        assertTrue(!usuarios.isEmpty());
    }

    private void mostrarUsuario(List<Usuario> usuarios) {
        usuarios.stream()
                .forEach(usuario -> {
                    System.out.println("ID " + usuario.getId());
                    System.out.println("NOME " + usuario.getNome());
                    System.out.println("LOGIN " + usuario.getLogin());
                    System.out.println("SENHA " + usuario.getSenha());
                    System.out.println("");
                });
    }

    private void mostrarUsuarioSorted(List<Usuario> usuarios) {
        usuarios.stream()
                .sorted((usu1, usu2) -> usu1.getNome().compareTo(usu2.getNome()))
                .forEach(usuario -> {
                    System.out.println("ID " + usuario.getId());
                    System.out.println("NOME " + usuario.getNome());
                    System.out.println("LOGIN " + usuario.getLogin());
                    System.out.println("SENHA " + usuario.getSenha());
                    System.out.println("");
                });
    }

    @Test
    public void testPesquisarPorNome() {
        System.out.println("pesquisarPorNome");
        buscarUsuarioBD();
        sessao = HibernateUtil.abrirConexao();                              //abre conexão                 
        List<Usuario> usuarios = usuarioDao.pesquisarPorNome(usuario.getNome(), sessao);
        sessao.close();

        assertTrue(usuarios.size() > 0);
    }

    @Test
    public void testLogar() {
        System.out.println("Logar");
        buscarUsuarioBD();
        sessao = HibernateUtil.abrirConexao();                              //abre conexão                 
        Usuario usuarioLogado = usuarioDao
                .logar(usuario.getLogin(), usuario.getSenha(), sessao);                   //instancia usuarioDao para usar método pesquisar
        sessao.close();

        assertNotNull(usuarioLogado);
    }

    @Test
    public void testPesquisarPorId() {
        System.out.println("pesquisarPorId");
        buscarUsuarioBD();
        sessao = HibernateUtil.abrirConexao();                              //abre conexão                 
        Usuario usuarioPesquisado = usuarioDao
                .pesquisarPorId(usuario.getId(), sessao);                   //instancia usuarioDao para usar método pesquisar
        sessao.close();

        assertNotNull(usuarioPesquisado);
    }

    public Usuario buscarUsuarioBD() {
        sessao = HibernateUtil.abrirConexao();

        Query<Usuario> consulta = sessao.createQuery("from Usuario u");     //HQL    usuario é a classe java.        
        List<Usuario> usuarios = consulta.getResultList();
        sessao.close();                                                     //fecha conexão

        if (usuarios.isEmpty()) {
            testSalvar();                                                   //se vazia, chama o teste salvar e cria usuario
        } else {
            usuario = usuarios.get(0);                                      //busca o primeiro da lista
        }
        return usuario;
    }

}
