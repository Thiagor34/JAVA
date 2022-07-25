package aula19;

public class TesteException {

    public static void main(String[] args) {
        System.out.println("Início do main");
        metodo1();
        System.out.println("Fim do main");
    }

    static void metodo1() {
        System.out.println("Inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }

    static void metodo2() {

        try {

            System.out.println("Inicio do metodo 2");
            int[] array = new int[10];
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }

            System.out.println("Fim do metodo 2");

        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Ocorreu um erro! " + ex.getMessage());

        } finally {
            System.out.println("Encerrado!");
        }
    }

}
