package br.com.senac.dao;

import br.com.senac.entidade.Cliente;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import util.Gerador;

public class ClienteDAOImplTest {
    
    private Cliente cliente;
    private ClienteDAO clienteDAO;
    
    public ClienteDAOImplTest() {
        clienteDAO =  new ClienteDAOImpl();
    }

    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        cliente = new Cliente(Gerador.gerarNome(), Gerador.gerarCpf(), Gerador.gerarNumero(6), Double.valueOf(Gerador.gerarNumero(4)));
        
        clienteDAO.salvar(cliente);
        assertNotNull(cliente.getId());
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
