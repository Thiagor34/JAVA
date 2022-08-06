package br.com.senac.dao;

import java.sql.*;
import br.com.senac.entidade.Usuario;
import java.util.List;

public interface UsuarioDAO {
    
    void salvar(Usuario usuario) throws SQLException;
    void alterar(Usuario usuario) throws SQLException;
    void excluir(Integer id) throws SQLException;
    Usuario pesquisarPorId(Integer id) throws SQLException;
    List<Usuario> pesquisarTudo() throws SQLException;
    List<Usuario> pesquisarPorNome(String nome) throws SQLException;

}
