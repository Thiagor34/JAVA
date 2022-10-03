package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("NoteBook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //Comparator expressão lambda

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        //Comparator utilizando uma classe

        list.sort(new MyComparator());

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
