package application;

import entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    //int é positivo caso o primeiro seja maior que o segundo
    //int é zero caso sejam iguais
    //int é negativo caso o primeiro seja menor que o segundo

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()) ;
    }
}
