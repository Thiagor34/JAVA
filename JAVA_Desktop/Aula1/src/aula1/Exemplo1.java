package aula1;

import aula1_service.Calculadora;
import javax.swing.JOptionPane;

public class Exemplo1 {

    public static void main(String[] args) {

        int valor1 = 10;
        int valor2 = 7;
        int valor3 = 12;

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(valor1, valor2, valor3));
        
        String frase = "Simples como amar";
        int totalLetra = calculadora.frase(frase);
        JOptionPane.showMessageDialog(null, "Total de Letras " + totalLetra);
        
        int aleatorio = calculadora.numAleatorio();
        JOptionPane.showMessageDialog(null, "Número aleatório " + aleatorio);
    }
}
