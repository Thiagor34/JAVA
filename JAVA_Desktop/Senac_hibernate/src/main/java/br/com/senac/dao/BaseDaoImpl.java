package br.com.senac.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class BaseDaoImpl<T, ID> implements BaseDao<T, ID> {

    private Transaction transaction;

    @Override
    public void salvarOuAlterar(T entidade, Session sessao) throws HibernateException {
        transaction = sessao.beginTransaction();
        sessao.saveOrUpdate(entidade);
        transaction.commit();
    }

    @Override
    public void excluir(T entidade, Session sessao) throws HibernateException {
        transaction = sessao.beginTransaction();
        sessao.delete(entidade);
        transaction.commit();
    }

    @Override
    public T pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return null;
    }
}
