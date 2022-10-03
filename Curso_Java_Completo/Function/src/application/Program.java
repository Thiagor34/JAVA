package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //forma 1
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());    //Function
        names.forEach(System.out::println);

        //forma 2
        List<String> names1 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());    //Reference method
        names.forEach(System.out::println);

        //forma 3
        List<String> names2 = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());    //Reference method (non static)
        names.forEach(System.out::println);

        //forma 4
        Function<Product, String> func =  p -> p.getName().toUpperCase();

        List<String> names3 = list.stream().map(func).collect(Collectors.toList());    //Expressão lambda declarada
        names.forEach(System.out::println);

        //forma 5
        List<String> names4 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());    //Expressão lambda inline
        names.forEach(System.out::println);



    }
}
