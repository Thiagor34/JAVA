package aula13;

import java.util.Scanner;

public class Calculadora {

    public int somar(int numUm, int numDois) {
        
        return (numUm + numDois);
    }

    public int subtrair(int numUm, int numDois) {
        return (numUm - numDois);
    }

    public int multiplicar(int numUm, int numDois) {
        return (numUm * numDois);
    }

    public double dividir(double numUm, double numDois) {
        return (numUm / numDois);
    }
    
    public boolean maior(int numUm, int numDois){
        return ((numUm > numDois)? true:false);        
    }

}
