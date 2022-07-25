/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2.exer2;

/**
 *
 * @author Thiago
 */
public class TypeCast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade = 32790;
        
        byte variavelbyte = (byte)idade;
        short variavelShort = (short)idade;
        char variavelChar = (char)idade;
        long variavelLong = idade;
        float variavelFloat = idade;
        double variavelDouble = idade;
        
        //exercicio dois da aula
        
        String idade1 = "15";
        int idade1Int = Integer.parseInt(idade1);
        
        System.out.println(idade1Int);
    }
    
}
