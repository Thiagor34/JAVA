package br.com.senac.dao;

import br.com.senac.entidade.Usuario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class UsuarioDaoImpl extends BaseDaoImpl<Usuario, Long> implements UsuarioDao {

    @Override
    public Usuario pesquisarPorId(Long id, Session sessao) throws HibernateException {
        Usuario usuario = sessao.find(Usuario.class, id);
        return usuario;
    }

    @Override
    public List<Usuario> pesquisarPorNome(String nome, Session sessao) throws HibernateException {
        Query<Usuario> consulta = sessao.createQuery("FROM Usuario u WHERE u.nome LIKE :vNome");    //u.nome = getnome
        consulta.setParameter("vNome", "%" + nome + "%");
        return consulta.getResultList();
    }

    @Override
    public List<Usuario> pesquisarTodos(Session sessao) throws HibernateException {
        Query<Usuario> consultaTudo = sessao.createQuery("FROM Usuario u ORDER BY u.nome");
        return consultaTudo.getResultList();
    }

    @Override
    public Usuario logar(String login, String senha, Session sessao) throws HibernateException {
        Query<Usuario> logar = sessao.createQuery("FROM Usuario u WHERE u.login = :login AND u.senha = :senha");
        logar.setParameter("login", login);
        logar.setParameter("senha", senha);

        return logar.uniqueResult();        //o singleREsult tem que tratar se for nulo
    }

}
