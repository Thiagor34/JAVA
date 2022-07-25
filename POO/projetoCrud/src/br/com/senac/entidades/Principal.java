package br.com.senac.entidades;

import br.com.senac.dao.ProdutoDAO;
import br.com.senac.dao.impl.ProdutoDAOImpl;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        try {
            ProdutoDAO dao = new ProdutoDAOImpl();
            dao.criarTabela();
            
            //instanciando produto
            Produto chocolate = new Produto("Chocolate", 5.00, LocalDate.of(2022, Month.DECEMBER, 15));
            Produto cereal = new Produto("Cereal", 2.50, LocalDate.of(2022, Month.DECEMBER, 16));
            
            //criando no banco
            cereal = dao.criar(cereal);          
            chocolate = dao.criar(chocolate);

            System.out.println("Criou");
            
            //reader
            Produto chocolateBanco = dao.buscarPeloId(2);
            if (chocolateBanco != null) {
                System.out.println(chocolateBanco.toString());
            } else {
                System.out.println("Não existe produto com esse ID");
            }

            //update
            Produto update = dao.buscarPeloId(2);
            update.setNome("Rosca");
            dao.atualizar(update);

            //delete por id
            //dao.remover(1);
            
            //listar todos
            List<Produto> produtos = dao.pesquisarTodos();
            for (Produto produto : produtos ) {
                System.out.println(produto);
            }

            //delete todos produtos
            //dao.removerRegistros();

        } catch (Exception ex) {
            System.out.println("Não conectou: " + ex.getMessage());
        }
    }
}
