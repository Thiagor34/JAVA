package br.com.senac.dao;

import br.com.senac.entidade.Usuario;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class UsuarioDaoImpl extends BaseDaoImpl<Usuario, Long> implements UsuarioDao {

    @Override
    public Usuario pesquisarPorId(Long id, Session sessao) throws HibernateException {
        Usuario usuario = sessao.find(Usuario.class, id);
        return usuario;
    }

}
