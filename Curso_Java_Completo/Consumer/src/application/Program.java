package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //forma 1
        list.forEach(new PriceUpdate());                //Consumer

        //forma 2
        list.forEach(Product::staticPriceUpdate);       //Reference method static

        //forma 3
        list.forEach(Product::nonStaticPriceUpdate);    //Reference method (non static)

        //forma 4
        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * 1.1);
        };
        list.forEach(cons);                             //Expressão lambda declarada

        //forma 5
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1)); //Expressão lambda inline


        list.forEach(System.out::println);              //Impressão

    }
}
