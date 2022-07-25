package br.com.senac.dao.impl;

import br.com.senac.dao.ConnectionManager;
import br.com.senac.dao.ProdutoDAO;
import br.com.senac.entidades.Produto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAOImpl implements ProdutoDAO {

    @Override
    public void criarTabela() throws Exception {
        Connection conexao = null;
        Statement statement = null;

        try {
            conexao = ConnectionManager.abrirConexao();
            statement = conexao.createStatement();
            statement.executeUpdate(getSqlCriarTabelaProduto());
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement);
        }
    }

    @Override
    public Produto criar(Produto produto) throws Exception {

        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;

        try {
            String sql = "INSERT INTO produto (nome, preco, vencimento) VALUES( ?, ?, ?)";

            conexao = ConnectionManager.abrirConexao();
            statement = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, produto.getNome());
            statement.setDouble(2, produto.getPreco());
            statement.setDate(3, Date.valueOf(produto.getVencimento()));

            statement.execute();

            resultado = statement.getGeneratedKeys();
            if (resultado.next()) {
                produto.setId(resultado.getLong(1));
            }

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement, resultado);
        }
        return produto;
    }

    @Override
    public Produto buscarPeloId(long id) throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;
        Produto produto = null;

        try {
            conexao = ConnectionManager.abrirConexao();
            String sql = "SELECT * FROM produto WHERE id = ?";
            statement = conexao.prepareStatement(sql);

            statement.setLong(1, id);

            resultado = statement.executeQuery();
            if (resultado.next()) {
                produto = new Produto();
                produto.setId(id);
                produto.setNome(resultado.getString("nome"));
                produto.setPreco(resultado.getDouble("preco"));
                produto.setVencimento(resultado.getDate("vencimento").toLocalDate());
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement, resultado);
        }
        return produto;

    }

    @Override
    public Produto atualizar(Produto produto) throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;

        try {
            conexao = ConnectionManager.abrirConexao();
            String sql = "UPDATE produto SET nome = ?, preco = ?, vencimento = ? WHERE id = ?";
            statement = conexao.prepareStatement(sql);

            statement.setString(1, produto.getNome());
            statement.setDouble(2, produto.getPreco());
            statement.setDate(3, Date.valueOf(produto.getVencimento()));
            statement.setLong(4, produto.getId());

            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement, resultado);
        }
        return produto;
    }

    @Override
    public void remover(long id) throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;

        try {
            conexao = ConnectionManager.abrirConexao();
            String sql = "DELETE FROM produto WHERE id = ?";
            statement = conexao.prepareStatement(sql);

            statement.setLong(1, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement, resultado);
        }
    }

    @Override
    public List<Produto> pesquisarTodos() throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;
        List<Produto> produtos = new ArrayList();

        try {
            conexao = ConnectionManager.abrirConexao();
            String sql = "SELECT * FROM produto ORDER BY nome ASC";
            statement = conexao.prepareStatement(sql);

            resultado = statement.executeQuery();

            while (resultado.next()) {
                Produto produto = new Produto();
                produto.setId(resultado.getLong("id"));
                produto.setNome(resultado.getString("nome"));
                produto.setPreco(resultado.getDouble("preco"));
                produto.setVencimento(resultado.getDate("vencimento").toLocalDate());
                produtos.add(produto);
            }

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement, resultado);
        }
        return produtos;
    }

    @Override
    public void removerRegistros() throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;
 
        try {
            conexao = ConnectionManager.abrirConexao();
            String sql = "DELETE FROM produto";
            statement = conexao.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement);
        }
    }

    private String getSqlCriarTabelaProduto() {
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS produto (");
        sql.append("id int NOT NULL AUTO_INCREMENT, ");
        sql.append("nome varchar(45) NOT NULL, ");
        sql.append("preco decimal(10,2) NOT NULL DEFAULT '0.00', ");
        sql.append("vencimento date NOT NULL, ");
        sql.append("PRIMARY KEY (id)");
        sql.append(");");
        return sql.toString();
    }

}
