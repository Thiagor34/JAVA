package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("NoteBook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        list.sort(new MyComparator());

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
