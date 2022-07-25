package exercUm;
import java.util.Scanner;
public class ExercUm {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int numSort = (int) (Math.random() * 50) + 1;
        int num = 0;
        int contador = 0;

        do {
            System.out.print("Digite um Número entre 1 e 50: ");
            num = input.nextInt();
            if (num < numSort) {
                System.out.println("O número é Maior... Tente de novo!");
            } else if (num > numSort) {
                System.out.println("O número é Menor... Tente de novo!");
            } else {
                System.out.println("Parabéns! Número Aleatório é o: " + numSort);
            }
            contador++;
        } while (num != numSort);
        System.out.println("Você tentou " + contador + " vezes até acertar!");
    }
}