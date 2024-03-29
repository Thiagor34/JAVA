
package br.com.senac.dao;

import br.com.senac.entidade.Usuario;
import br.com.senac.entidade.Cliente;
import br.com.senac.entidade.Perfil;
import br.com.senac.entidade.Profissao;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory; //Singleton

    static {
        try {
            Configuration cfg = new Configuration();
            cfg.addAnnotatedClass(Usuario.class);
            cfg.addAnnotatedClass(Cliente.class);
            cfg.addAnnotatedClass(Perfil.class);
            cfg.addAnnotatedClass(Profissao.class);

            cfg.configure("/META-INF/hibernate.cfg.xml");
            StandardServiceRegistryBuilder build = new StandardServiceRegistryBuilder().
                    applySettings(cfg.getProperties());
            sessionFactory = cfg.buildSessionFactory(build.build());
        } catch (HibernateException ex) {
            System.err.println("Erro ao criar Hibernate util." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session abrirConexao() {
        return sessionFactory.openSession();
    }
}
