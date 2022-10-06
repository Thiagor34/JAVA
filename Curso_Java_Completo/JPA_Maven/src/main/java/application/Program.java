package application;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

        /*
        Pessoa p1 = new Pessoa(null, "Carlos Costa", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null, "Thiago Costa", "thiago@gmail.com");
        Pessoa p3 = new Pessoa(null, "Jonathan Costa", "jonathan@gmail.com");
        */

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();       //instancia e cria conexão com banco
        /*
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        */

        /*
        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);
        */

        Pessoa p = em.find(Pessoa.class, 2);
        em.getTransaction().begin();                    //se apenas consulta, não utiliza
        em.remove(p);
        em.getTransaction().commit();

        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}
