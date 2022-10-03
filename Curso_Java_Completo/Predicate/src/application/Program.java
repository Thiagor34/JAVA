package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //forma 1
        list.removeIf(new ProductPredicate());                 //Predicate

        //forma 2
        list.removeIf(Product::staticProductPredicate);        //Reference Method (static)

        //forma 3
        list.removeIf(Product::nonStaticProductPredicate);     //Reference Method (não static)

        //forma 4
        Predicate<Product> pred = p -> p.getPrice() >= 100;
        list.removeIf(pred);                                   //expressão lambda declarada

        //forma 5
        list.removeIf(p -> p.getPrice() >= 100.0);             //expressão lambda inline

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
