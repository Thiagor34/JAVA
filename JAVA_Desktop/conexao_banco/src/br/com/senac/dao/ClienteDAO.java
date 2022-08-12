package br.com.senac.dao;

import br.com.senac.entidade.Cliente;
import java.sql.SQLException;
import java.util.List;

public interface ClienteDAO {

    void salvar(Cliente cliente) throws SQLException;
    void alterar(Cliente cliente) throws SQLException;
    void excluir(Integer id) throws SQLException;
    Cliente pesquisarPorId(Integer id) throws SQLException;
    List<Cliente> pesquisarTudo() throws SQLException;
    List<Cliente> pesquisarPorNome(String nome) throws SQLException;

}
