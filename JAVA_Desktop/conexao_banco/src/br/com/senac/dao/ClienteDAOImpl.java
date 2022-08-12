package br.com.senac.dao;

import br.com.senac.entidade.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            FabricaConexao.fecharConexao(connection, statement);
        }
    }

    @Override
    public void alterar(Cliente cliente) throws SQLException {
    }

    @Override
    public void excluir(Integer id) throws SQLException {
    }

    @Override
    public Cliente pesquisarPorId(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> pesquisarTudo() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> pesquisarPorNome(String nome) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
