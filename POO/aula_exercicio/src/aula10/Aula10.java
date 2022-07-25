package aula10;

public class Aula10 {

    public static void main(String[] args) {
        // String[][] locais = new String[3][];
        // String locais[][] = new String[3][];

        String[] locais[] = new String[3][];
        int[][] notas = new int[3][3];
        int cont = 3, cont2 = 3;

        for (int indice = 0; indice < notas.length; indice++) {
            for (int coluna = 0; coluna < notas[indice].length; coluna++) {
                System.out.print(" " + notas[indice][coluna] + "  | ");

            }
            System.out.println();
            if (cont > 1) {

                System.out.println("---------------");
            }
            cont--;

        }

    }
}