package aula9;

public class Exer7 {

    public static void main(String[] args) {
        int notas[] = {3, 7, 9, 10, 6, 7, 8, 10, 4, 6, 7, 7, 8, 4, 9, 10, 10, 10, 8, 7, 6, 7, 6, 5, 7, 8, 8, 10, 9, 9};
        int resumo[] = new int[11];

        for (int i = 0; i < notas.length; i++) {
            ++resumo[notas[i]];
        }
        System.out.print("Nota    Frequencia\n");
        
        for (int j = 1; j < resumo.length; j++) {
            if(resumo[j] == 0){
                continue;
            }
            System.out.printf("%3d%10d\n", j, resumo[j]);

        }
    }
}
