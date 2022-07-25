package br.com.senac.dao.impl;

import br.com.senac.dao.ConnectionManager;
import br.com.senac.dao.PacienteDAO;
import br.com.senac.entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAOImpl implements PacienteDAO {

    @Override
    public Paciente criar(Paciente paciente) throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;

        try {
            String sql = "INSERT INTO paciente (nome, cpf, nascimento) VALUES( ?, ?, ?)";

            conexao = ConnectionManager.abrirConexao();
            statement = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, paciente.getNome());
            statement.setString(2, paciente.getCpf());
            statement.setDate(3, Date.valueOf(paciente.getNascimento()));

            statement.execute();

            resultado = statement.getGeneratedKeys();
            if (resultado.next()) {
                paciente.setId(resultado.getLong(1));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao Criar Paciente: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement);
        }
        return paciente;
    }

    @Override
    public Paciente alterar(Paciente paciente) throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;

        try {
            conexao = ConnectionManager.abrirConexao();
            String sql = "UPDATE paciente SET nome = ?, cpf = ?, nascimento = ? WHERE id = ?";
            statement = conexao.prepareStatement(sql);

            statement.setString(1, paciente.getNome());
            statement.setString(2, paciente.getCpf());
            statement.setDate(3, Date.valueOf(paciente.getNascimento()));
            statement.setLong(4, paciente.getId());

            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao Alterar Paciente: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement, resultado);
        }
        return paciente;
    }

    @Override
    public Paciente pesquisarPorId(long id) throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;
        Paciente paciente = null;

        try {
            conexao = ConnectionManager.abrirConexao();
            String sql = "SELECT * FROM paciente WHERE id = ?";
            statement = conexao.prepareStatement(sql);
            statement.setLong(1, id);

            resultado = statement.executeQuery();
            if (resultado.next()) {
                paciente = new Paciente();
                paciente.setId(id);
                paciente.setNome(resultado.getString("nome"));
                paciente.setCpf(resultado.getString("cpf"));
                paciente.setNascimento(resultado.getDate("nascimento").toLocalDate());
            }
        } catch (SQLException e) {
            System.out.println("Erro ao Buscar o ID: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement, resultado);
        }
        return paciente;
    }

    @Override
    public List<Paciente> pesquisarTodos() throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;
        List<Paciente> pacientes = new ArrayList();

        try {
            conexao = ConnectionManager.abrirConexao();
            String sql = "SELECT * FROM paciente ORDER BY nome ASC";
            statement = conexao.prepareStatement(sql);

            resultado = statement.executeQuery();

            while (resultado.next()) {
                Paciente paciente = new Paciente();
                paciente.setId(resultado.getLong("id"));
                paciente.setNome(resultado.getString("nome"));
                paciente.setCpf(resultado.getString("cpf"));
                paciente.setNascimento(resultado.getDate("nascimento").toLocalDate());
                
                pacientes.add(paciente);
            }

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            throw new Exception(e);
        } finally {
            ConnectionManager.fecharConexao(conexao, statement, resultado);
        }
        return pacientes;
    }

    @Override
    public void excluir(long id) throws Exception {
        Connection conexao = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;

        try {
            conexao = ConnectionManager.abrirConexao();
            String sql = "DELETE FROM paciente WHERE id = ?";
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

}
