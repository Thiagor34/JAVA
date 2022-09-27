package br.com.senac.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabela {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("senac_pu");
        emf.close();
    }
}
