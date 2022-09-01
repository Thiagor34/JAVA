package br.com.senac.dao;

import br.com.senac.entities.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thiago
 */
public class ProdutoDAOImpl implements ProdutoDAO {

    private Connection connection;
    private PreparedStatement statement;
    private ResultSet result;

    @Override
    public void salvar(Produto produto) throws SQLException {
        String sql = "INSERT INTO produto(nome, descricao, estoque, preco) VALUES (?, ?, ?, ?)";

        try {
            connection = FabricaConexao.abrirConexao();
            statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, produto.getNome());
            statement.setString(2, produto.getDescricao());
            statement.setInt(3, produto.getEstoque());
            statement.setDouble(4, produto.getPreco());

            statement.execute();

            result = statement.getGeneratedKeys();
            if (result.next()) {
                produto.setId(result.getInt(1));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao salvar Produto " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(connection, statement, result);
        }
    }

    @Override
    public void alterar(Produto produto) throws SQLException {
        String sql = "UPDATE produto SET nome = ?, descricao = ?, estoque = ?, preco = ? WHERE id = ?";

        try {
            connection = FabricaConexao.abrirConexao();
            statement = connection.prepareStatement(sql);

            statement.setString(1, produto.getNome());
            statement.setString(2, produto.getDescricao());
            statement.setInt(3, produto.getEstoque());
            statement.setDouble(4, produto.getPreco());
            statement.setInt(5, produto.getId());

            statement.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao alterar Produto " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(connection, statement, result);
        }
    }

    @Override
    public void excluir(Integer id) throws SQLException {
        try {
            connection = FabricaConexao.abrirConexao();
            statement = connection.prepareStatement("DELETE FROM produto WHERE id = ?");

            statement.setInt(1, id);
            statement.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao excluir Produto " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(connection, statement, result);
        }
    }

    @Override
    public List<Produto> pesquisarPorNome(String nome) throws SQLException {
        List<Produto> produtos = new ArrayList();
        Produto produto;
        String sql = "SELECT * FROM produto WHERE nome LIKE ?";

        try {
            connection = FabricaConexao.abrirConexao();
            statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + nome + "%");
            result = statement.executeQuery();

            while (result.next()) {
                produto = new Produto();
                produto.setId(result.getInt("id"));
                produto.setNome(result.getString("nome"));
                produto.setDescricao(result.getString("descricao"));
                produto.setEstoque(result.getInt("estoque"));
                produto.setPreco(result.getDouble("preco"));

                produtos.add(produto);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao pesquisar Produto por nome " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(connection, statement, result);
        }
        return produtos;
    }

    @Override
    public Produto pesquisarPorId(Integer id) throws SQLException {
        String sql = "SELECT * FROM produto WHERE id = ?";
        Produto produto = null;

        try {
            connection = FabricaConexao.abrirConexao();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            result = statement.executeQuery();

            if (result.next()) {
                produto = new Produto();
                produto.setId(result.getInt("id"));
                produto.setNome(result.getString("nome"));
                produto.setDescricao(result.getString("descricao"));
                produto.setEstoque(result.getInt("estoque"));
                produto.setPreco(result.getDouble("preco"));

            }

        } catch (SQLException e) {
            System.out.println("Erro ao pesquisar ID Produto " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(connection, statement, result);
        }
        return produto;
    }

}
