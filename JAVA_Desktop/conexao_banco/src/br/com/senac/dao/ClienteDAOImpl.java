package br.com.senac.dao;

import br.com.senac.entidade.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {

    private Connection connection;
    private PreparedStatement statement;
    private ResultSet result;

    @Override
    public void salvar(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente(nome, cpf, rg, salario) VALUES (?, ?, ?, ?)";

        try {
            connection = FabricaConexao.abrirConexao();
            statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCpf());
            statement.setString(3, cliente.getRg());
            statement.setDouble(4, cliente.getSalario());

            statement.execute();

            result = statement.getGeneratedKeys();
            if (result.next()) {
                cliente.setId(result.getInt(1));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao salvar cliente " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(connection, statement, result);
        }
    }

    @Override
    public void alterar(Cliente cliente) throws SQLException {
        String sql = "UPDATE cliente SET nome = ?, cpf = ?, rg = ?, salario = ? WHERE id = ?";

        try {
            connection = FabricaConexao.abrirConexao();
            statement = connection.prepareStatement(sql);

            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCpf());
            statement.setString(3, cliente.getRg());
            statement.setDouble(4, cliente.getSalario());
            statement.setInt(5, cliente.getId());

            statement.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao alterar Cliente " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(connection, statement, result);
        }
    }

    @Override
    public void excluir(Integer id) throws SQLException {
        try {
            connection = FabricaConexao.abrirConexao();
            statement = connection.prepareStatement("DELETE FROM cliente WHERE id = ?");

            statement.setInt(1, id);
            statement.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao excluir Cliente " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(connection, statement, result);
        }
    }

    @Override
    public Cliente pesquisarPorId(Integer id) throws SQLException {
        String sql = "SELECT * FROM cliente WHERE id = ?";
        Cliente cliente = null;

        try {
            connection = FabricaConexao.abrirConexao();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            result = statement.executeQuery();

            if (result.next()) {
                cliente = new Cliente();
                cliente.setId(id);
                cliente.setNome(result.getString("nome"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setRg(result.getString("rg"));
                cliente.setSalario(result.getDouble("salario"));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao pesquisar ID cliente " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(connection, statement, result);
        }
        return cliente;
    }

    @Override
    public List<Cliente> pesquisarTudo() throws SQLException {
        List<Cliente> clientes = new ArrayList();
        String sql = "SELECT * FROM cliente ORDER BY nome ASC";
        Cliente cliente;

        try {
            connection = FabricaConexao.abrirConexao();
            statement = connection.prepareStatement(sql);

            result = statement.executeQuery();

            while (result.next()) {
                cliente = new Cliente();
                cliente.setId(result.getInt("id"));
                cliente.setNome(result.getString("nome"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setRg(result.getString("rg"));
                cliente.setSalario(result.getDouble("salario"));

                clientes.add(cliente);
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar todos Clientes " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(connection, statement, result);
        }
        return clientes;
    }

    public List<Cliente> pesquisarPorNome(String nome) throws SQLException {
        List<Cliente> clientes = new ArrayList();
        Cliente cliente;
        String sql = "SELECT * FROM cliente WHERE nome LIKE ?";

        try {
            connection = FabricaConexao.abrirConexao();
            statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + nome + "%");
            result = statement.executeQuery();

            while (result.next()) {
                cliente = new Cliente();
                cliente.setId(result.getInt("id"));
                cliente.setNome(result.getString("nome"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setRg(result.getString("rg"));
                cliente.setSalario(result.getDouble("salario"));

                clientes.add(cliente);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao pesquisar ID cliente " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(connection, statement, result);
        }
        return clientes;

    }

}
