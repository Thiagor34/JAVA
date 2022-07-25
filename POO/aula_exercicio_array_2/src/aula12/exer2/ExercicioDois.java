package aula12.exer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {
        // TODO code application logic here

        List<Pessoa> listaPessoa = new ArrayList();

        Scanner input = new Scanner(System.in);
        System.out.println("Deseja informar quantas pessoas? ");
        int qtd = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= qtd; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.print("Nome: ");
            pessoa.nome = input.nextLine();
            System.out.print("Sobrenome: ");
            pessoa.sobrenome = input.nextLine();
            System.out.print("Data Nascimento: ");
            pessoa.dataNasc = input.nextLine();

            listaPessoa.add(pessoa);

        }
        for (Pessoa pessoa : listaPessoa) {
            System.out.println("-----------------------");
            System.out.println("Nome: " + pessoa.nome);
            System.out.println("Sobrenome" + pessoa.sobrenome);
            System.out.println("Data Nasc: " +pessoa.dataNasc);
            System.out.println("-----------------------");
            
        }

    }

}