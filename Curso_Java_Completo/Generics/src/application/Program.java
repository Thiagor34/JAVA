package application;

import services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values?");
        Integer n = input.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = input.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());
    }
}
