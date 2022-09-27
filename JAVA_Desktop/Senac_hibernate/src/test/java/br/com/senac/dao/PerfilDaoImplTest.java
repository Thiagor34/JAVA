package br.com.senac.dao;

import br.com.senac.entidade.Perfil;
import br.com.senac.util.Gerador;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thiago
 */
public class PerfilDaoImplTest {

    private Perfil perfil;
    private PerfilDao perfilDao;
    private Session sessao;

    public PerfilDaoImplTest() {
        perfilDao = new PerfilDaoImpl();
    }

    @Test
    public void testSalvar() {
        perfil = new Perfil(Gerador.gerarNome(), "Lorem ipsum dolor siamet");
        sessao = HibernateUtil.abrirConexao();
        perfilDao.salvarOuAlterar(perfil, sessao);
        sessao.close();

        assertNotNull(this.perfil.getId());
    }

    @Test
    public void testAlterar() {
        System.out.println("Alterar");
        buscarPerfilBD();
        perfil.setNome(Gerador.gerarNome());
        sessao = HibernateUtil.abrirConexao();
        perfilDao.salvarOuAlterar(perfil, sessao);
        sessao.close();

        sessao = HibernateUtil.abrirConexao();
        Perfil perfilAlterado = perfilDao.pesquisarPorId(perfil.getId(), sessao);
        sessao.close();

        assertEquals(perfilAlterado.getNome(), perfil.getNome());
    }

    @Test
    public void testExcluir() {
        System.out.println("excluir");
        buscarPerfilBD();
        sessao = HibernateUtil.abrirConexao();
        perfilDao.excluir(perfil, sessao);
        Perfil perfilExcluido = perfilDao.pesquisarPorId(perfil.getId(), sessao);
        sessao.close();

        assertNull(perfilExcluido);
    }

    @Test
    public void testPesquisarPorId() {
        System.out.println("pesquisarPorId");
        buscarPerfilBD();
        sessao = HibernateUtil.abrirConexao();
        Perfil perfilPesquisado = perfilDao.pesquisarPorId(perfil.getId(), sessao);
        sessao.close();

        assertNull(perfilPesquisado);

    }

    @Test
    public void testPesquisarPorNome() {
        System.out.println("pesquisarPorNome");
        buscarPerfilBD();
        sessao = HibernateUtil.abrirConexao();
        List<Perfil> perfis = perfilDao.pesquisarPorNome(perfil.getNome(), sessao);
        sessao.close();

        assertTrue(perfis.size() > 0);
    }

    @Test
    public void testPesquisarTodos() {
        System.out.println("pesquisarTodos");
        buscarPerfilBD();
        sessao = HibernateUtil.abrirConexao();
        List<Perfil> perfis = perfilDao.pesquisarTodos(sessao);
        sessao.close();
        mostrar(perfis);

        assertTrue(!perfis.isEmpty());
    }
    
    private void mostrar(List<Perfil> perfis) {
        perfis.stream()
                .forEach(per -> System.out.println(per.toString()));
    }

    public Perfil buscarPerfilBD() {
        sessao = HibernateUtil.abrirConexao();
        Query<Perfil> consulta = sessao.createQuery("from Perfil p");
        consulta.setMaxResults(1);
        List<Perfil> perfis = consulta.getResultList();
        sessao.close();
        if (perfis.isEmpty()) {
            testSalvar();
        } else {
            perfil = perfis.get(0);
        }
        return perfil;
    }

}
