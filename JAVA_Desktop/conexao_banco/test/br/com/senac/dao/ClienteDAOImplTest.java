package br.com.senac.dao;

import br.com.senac.entidade.Cliente;
import br.com.senac.entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import util.Gerador;

public class ClienteDAOImplTest {

    private Cliente cliente;
    private ClienteDAO clienteDAO;

    public ClienteDAOImplTest() {
        clienteDAO = new ClienteDAOImpl();
    }

    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        cliente = new Cliente(
                Gerador.gerarNome(),
                Gerador.gerarCpf(),
                Gerador.gerarNumero(6),
                Gerador.gerarSalario());

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
        buscarClienteBD();
        Cliente clientePesquisado = clienteDAO.pesquisarPorId(cliente.getId());
        System.out.println(cliente.toString());
        
        assertNotNull(clientePesquisado);
    }

    @Test
    public void testPesquisarTudo() throws Exception {
        System.out.println("pesquisarTudo");
    }

    @Test
    public void testPesquisarPorNome() throws Exception {
        System.out.println("pesquisarPorNome");
    }

    private Cliente buscarClienteBD() throws Exception {
        String sql = "SELECT * FROM cliente";
        Connection connection = FabricaConexao.abrirConexao();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet result = statement.executeQuery();

        if (result.next()) {
            cliente = new Cliente();
            cliente.setId(result.getInt("id"));
            cliente.setNome(result.getString("nome"));
            cliente.setCpf(result.getString("cpf"));
            cliente.setRg(result.getString("rg"));
            cliente.setSalario(result.getDouble("salario"));
        } else {
            testSalvar();
        }
        return cliente;
    }

}
