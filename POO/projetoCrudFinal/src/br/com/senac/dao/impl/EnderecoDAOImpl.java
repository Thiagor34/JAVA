package br.com.senac.dao.impl;

import br.com.senac.dao.ConnectionManager;
import br.com.senac.dao.EnderecoDAO;
import br.com.senac.entidades.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDAOImpl implements EnderecoDAO {

    @Override
    public void criar(Endereco endereco, long idPaciente) throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;

        try {
            String sql = "INSERT INTO endereco (logradouro, cep, id_paciente, numero) VALUES( ?, ?, ?, ?)";

            conexao = ConnectionManager.abrirConexao();
            statement = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, endereco.getLogradouro());
            statement.setString(2, endereco.getCep());
            statement.setLong(3, idPaciente);
            statement.setInt(4, endereco.getNumero());

            statement.execute();

        } catch (SQLException e) {
            System.out.println("Erro ao Criar Endereço: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement);
        }
    }

    @Override
    public Endereco alterar(Endereco endereco) throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;

        try {
            conexao = ConnectionManager.abrirConexao();
            String sql = "UPDATE endereco SET logradouro = ?, cep = ?, numero = ? WHERE id = ?";
            statement = conexao.prepareStatement(sql);

            statement.setString(1, endereco.getLogradouro());
            statement.setString(2, endereco.getCep());
            statement.setInt(3, endereco.getNumero());
            statement.setLong(4, endereco.getId());

            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao Alterar Endereço: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement, resultado);
        }
        return endereco;
    }

    @Override
    public Endereco pesquisarPorId(long id) throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;
        Endereco endereco = null;

        try {
            conexao = ConnectionManager.abrirConexao();
            String sql = "SELECT * FROM endereco WHERE id = ?";
            statement = conexao.prepareStatement(sql);
            statement.setLong(1, id);
            resultado = statement.executeQuery();

            while (resultado.next()) {
                endereco = new Endereco();
                endereco.setId(resultado.getLong("id"));
                endereco.setLogradouro(resultado.getString("logradouro"));
                endereco.setCep(resultado.getString("cep"));
                endereco.setNumero(resultado.getInt("numero"));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscaro ID: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement, resultado);
        }
        return endereco;
    }

    @Override
    public List<Endereco> pesquisarTodosPacientes(long idPaciente) throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;
        List<Endereco> enderecos = new ArrayList();

        try {
            conexao = ConnectionManager.abrirConexao();
            String sql = "SELECT * FROM endereco WHERE id_paciente = ?";
            statement = conexao.prepareStatement(sql);
            statement.setLong(1, idPaciente);
            resultado = statement.executeQuery();

            while (resultado.next()) {
                Endereco endereco = new Endereco();
                endereco.setId(resultado.getLong("id"));
                endereco.setLogradouro(resultado.getString("logradouro"));
                endereco.setCep(resultado.getString("cep"));
                endereco.setNumero(resultado.getInt("numero"));
                enderecos.add(endereco);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar endereços dos Pacientes: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement, resultado);
        }
        return enderecos;
    }

    @Override
    public void excluir(long id) throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;

        try {
            conexao = ConnectionManager.abrirConexao();
            String sql = "DELETE FROM endereco WHERE id = ?";
            statement = conexao.prepareStatement(sql);

            statement.setLong(1, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao excluir Paciente: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement, resultado);
        }
    }

}
