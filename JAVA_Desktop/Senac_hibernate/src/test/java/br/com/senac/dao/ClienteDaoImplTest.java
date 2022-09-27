package br.com.senac.dao;

import br.com.senac.entidade.Cliente;
import br.com.senac.util.Gerador;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteDaoImplTest {
    
    private Cliente cliente;
    private ClienteDao clienteDao;
    private Session sessao;
    
    public ClienteDaoImplTest() {
        clienteDao = new ClienteDaoImpl();
    }
    
     @Test
    public void testSalvar() {
        System.out.println("salvar");
        cliente = new Cliente(Gerador.gerarNome(), Gerador.gerarCpf(), Gerador.gerarNumero(5), Gerador.gerarSalario());

        sessao = HibernateUtil.abrirConexao();
        clienteDao.salvarOuAlterar(cliente, sessao);
        sessao.close();

        assertNotNull(cliente.getId());
    }

    @Test
    public void testExcluir() {
        System.out.println("excluir");
        buscarClienteBD();
        sessao = HibernateUtil.abrirConexao();
        clienteDao.excluir(cliente, sessao);

        Cliente clienteExcluido = clienteDao.pesquisarPorId(cliente.getId(), sessao);
        sessao.close();

        assertNull(clienteExcluido);
    }

    @Test
    public void testAlterar() {
        System.out.println("alterar");
        buscarClienteBD();
        cliente.setNome(Gerador.gerarNome());
        sessao = HibernateUtil.abrirConexao();
        clienteDao.salvarOuAlterar(cliente, sessao);
        sessao.close();

        sessao = HibernateUtil.abrirConexao();
        Cliente clientePesquisado = clienteDao.pesquisarPorId(cliente.getId(), sessao);
        sessao.close();

        assertEquals(clientePesquisado.getNome(), cliente.getNome());
    }

    @Test
    public void testPesquisarPorId() {
        System.out.println("pesquisarPorId");

    }

    @Test
    public void testPesquisarPorNome() {
        System.out.println("pesquisarPorNome");

    }

      
    public Cliente buscarClienteBD() {
        sessao = HibernateUtil.abrirConexao();

        Query<Cliente> consulta = sessao.createQuery("from Cliente c");     //HQL    usuario é a classe java.        
        List<Cliente> clientes = consulta.getResultList();
        sessao.close();                                                     //fecha conexão

        if (clientes.isEmpty()) {
            testSalvar();                                                   //se vazia, chama o teste salvar e cria usuario
        } else {
            cliente = clientes.get(0);                                      //busca o primeiro da lista
        }
        return cliente;
    }
    
}
