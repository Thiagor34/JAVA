package br.com.senac.dao;

import br.com.senac.entities.Produto;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Thiago
 */
public interface ProdutoDAO {

    void salvar(Produto produto) throws SQLException;

    void alterar(Produto produto) throws SQLException;

    void excluir(Integer id) throws SQLException;

    List<Produto> pesquisarPorNome(String nome) throws SQLException;

    Produto pesquisarPorId(Integer id) throws SQLException;

}
