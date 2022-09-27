package br.com.senac.dao;

import br.com.senac.entidade.Usuario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public interface UsuarioDao extends BaseDao<Usuario, Long> {

    List<Usuario> pesquisarPorNome(String nome, Session sessao) throws HibernateException;

    List<Usuario> pesquisarTodos(Session sessao) throws HibernateException;

    Usuario logar(String login, String senha, Session sessao) throws HibernateException;

}
