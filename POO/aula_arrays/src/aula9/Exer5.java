package aula9;

public class Exer5 {

    public static void main(String[] args) {
        int[] umArray = {5, 10, 15, 20, 25};
        int soma = 0;
        
        for (int numero: umArray) {
            soma += numero;            
        }
        System.out.println("soma: " + soma);
    }
}
