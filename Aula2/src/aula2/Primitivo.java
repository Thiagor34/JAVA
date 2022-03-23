/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2;

/**
 *
 * @author Thiago
 */
public class Primitivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte meuByte = 127;
        short meuShort = 32767;
        int meuInt = 2147483647;
        long meuLong = 92233;
        float meuFloat = 12345678;
        char meuChar = 'F';
        double meuDouble = 1000.50;
        boolean meuBoolean = false;
        
        float meuFloat1 = 50.0f;  //o f é para o java entender que é float e não converter para double
        char meuChar1 = '\u1445';   //o char também aceita unicode
        
        System.out.println(meuByte + "\n" + meuShort + "\n" + meuInt + "\n" + meuChar + "\n" + meuBoolean);
    }
    
}