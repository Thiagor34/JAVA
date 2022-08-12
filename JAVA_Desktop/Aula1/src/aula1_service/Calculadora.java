package aula1_service;

public class Calculadora {
    
    public int somar(int valor1, int valor2, int valor3) {
        return valor1 + valor2 + valor3;
        
    }
    
    public int frase(String frase) {
        return frase.length();
    }
    
    public int numAleatorio() {
       int ale = (int) (Math.random() * 10);
       return ale; 
    }
            
}
