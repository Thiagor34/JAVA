package aula10;

public class Exer1 {

    public static void main(String[] args) {
        int[][] meses = new int[12][];

        for (int i = 0; i < meses.length; i++) {
            switch (i) {
                case 1,3,5,7,8,10,12:
                    meses[i] = new int[31];
                    break;
                case 4,6,9,11:
                    meses[i] = new int[30];
                    break;
                case 2:
                    meses[i] = new int[28];
                    break;
            }
        }
        
        for (int linha = 0; linha < meses.length; linha++) {
            System.out.println("Mês: " + (linha + 1) + " com " + meses.length);

        }

    }

}
