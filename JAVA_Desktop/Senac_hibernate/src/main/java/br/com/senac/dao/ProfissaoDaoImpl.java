package br.com.senac.dao;

import br.com.senac.entidade.Profissao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Thiago
 */
public class ProfissaoDaoImpl extends BaseDaoImpl<Profissao, Long> implements ProfissaoDao {

    @Override
    public Profissao pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return sessao.find(Profissao.class, id);
    }

    @Override
    public List<Profissao> pesquisarPorNome(String nome, Session sessao) throws HibernateException {
        Query<Profissao> consulta = sessao.createQuery("FROM Profissao pr WHERE pr.nome LIKE :nome ORDER BY pr.nome");
        consulta.setParameter("nome", "%" + nome + "%");
        return consulta.getResultList();
    }

    @Override
    public List<Profissao> pesquisarTodos(Session sessao) throws HibernateException {
        Query<Profissao> consulta = sessao.createQuery("FROM Profissao pr ORDER BY pr.nome ASC");
        return consulta.getResultList();
    }

}
