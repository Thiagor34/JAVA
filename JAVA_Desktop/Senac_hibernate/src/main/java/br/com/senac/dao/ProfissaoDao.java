package br.com.senac.dao;

import br.com.senac.entidade.Profissao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Thiago
 */
public interface ProfissaoDao extends BaseDao<Profissao, Long> {

    List<Profissao> pesquisarPorNome(String nome, Session sessao) throws HibernateException;

    List<Profissao> pesquisarTodos(Session sessao) throws HibernateException;

}
