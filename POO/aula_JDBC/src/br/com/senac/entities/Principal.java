package br.com.senac.entities;

import br.com.senac.dao.ProdutoDAOImpl;
import java.time.LocalDate;
import java.time.Month;

public class Principal {

    public static void main(String[] args) {
        try {
            ProdutoDAOImpl dao = new ProdutoDAOImpl();
            dao.criarTabela();
            
            Produto maca = new Produto("maça", 15.00, LocalDate.of(2022, Month.JUNE, 27));
            dao.criar(maca);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

}
