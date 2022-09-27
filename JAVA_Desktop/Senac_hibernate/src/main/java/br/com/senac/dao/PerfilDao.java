package br.com.senac.dao;

import br.com.senac.entidade.Perfil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public interface PerfilDao extends BaseDao<Perfil, Long> {
    
    List<Perfil> pesquisarPorNome(String nome, Session sessao) throws HibernateException;
    
    List<Perfil> pesquisarTodos(Session sessao) throws HibernateException;
    

}
