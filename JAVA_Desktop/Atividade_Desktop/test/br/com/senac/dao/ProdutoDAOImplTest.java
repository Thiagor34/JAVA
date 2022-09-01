package br.com.senac.dao;

import br.com.senac.entities.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import util.Gerador;

/**
 *
 * @author Thiago
 */
public class ProdutoDAOImplTest {
    
    private Produto produto;
    private ProdutoDAO produtoDAO;
    
    public ProdutoDAOImplTest() {
        produtoDAO = new ProdutoDAOImpl();
    }

    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        produto = new Produto(Gerador.gerarNome()
                , Gerador.gerarNome()                       // utilizei o gerarnome para gerar uma descrição
                , Integer.parseInt(Gerador.gerarNumero(2))
                , Double.valueOf(Gerador.gerarSalario()));  // utilizei o gerarsalario para gerar um preço
        
        produtoDAO.salvar(produto);
        assertNotNull(produto.getId());
    }

    @Test
    public void testAlterar() throws Exception {
        System.out.println("alterar");
        buscarProdutoBD();
        produto.setNome(Gerador.gerarNome());
        produtoDAO.alterar(produto);
        Produto produtoAlterado = produtoDAO.pesquisarPorId(produto.getId());
        
        assertEquals(produto.getNome(), produtoAlterado.getNome());

    }

    @Test
    public void testExcluir() throws Exception {
        System.out.println("excluir");
        buscarProdutoBD();
        produtoDAO.excluir(produto.getId());
        Produto produtoExcluido = produtoDAO.pesquisarPorId(produto.getId());
        System.out.println(produtoExcluido);
        
        assertNull(produtoExcluido);
    }

    @Test
    public void testPesquisarPorNome() throws Exception {
        System.out.println("pesquisarPorNome");
        buscarProdutoBD();
        List<Produto> produtoPorNome = produtoDAO.pesquisarPorNome(produto.getNome());
        
        assertTrue(produtoPorNome.size() > 0);
    }

    @Test
    public void testPesquisarPorId() throws Exception {
        System.out.println("pesquisarPorId");
        buscarProdutoBD();
        Produto produtoPesquisado = produtoDAO.pesquisarPorId(produto.getId());
        
        assertNotNull(produtoPesquisado);
    }
    
    private Produto buscarProdutoBD() throws Exception {
        String sql = "SELECT * FROM produto";
        Connection connection = FabricaConexao.abrirConexao();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet result = statement.executeQuery();

        if (result.next()) {
            produto = new Produto();
            produto.setId(result.getInt("id"));
            produto.setNome(result.getString("nome"));
            produto.setDescricao(result.getString("descricao"));
            produto.setEstoque(result.getInt("estoque"));
            produto.setPreco(result.getDouble("preco"));
        } else {
            testSalvar();
        }
        return produto;
    }
    
}
