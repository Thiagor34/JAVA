package application;

import entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "Maria@gmail.com");
        Client c2 = new Client("Maria", "alex@gmail.com");

        System.out.println(c1.hashCode());      //hashcode gera um num inteiro, é mais rápido porém não tão preciso pois o int é limitado e pode gerar um numero igual(muito raro)
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));      //equals é 100% preciso
        System.out.println(c1 == c2);           //compara referencias de memórias
    }
}
