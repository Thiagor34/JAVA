package aula19;

public class TesteTryCatch {

    public static void main(String[] args) {
        // TODO code application logic here
        try {

            int resultado = 10 / 1;
            System.out.println("Conseguiu dividir a 1ª operação");

            int resultado2 = 10 / 0;
            System.out.println("Conseguiu dividir a 2ª operação");

        } catch (NullPointerException ex) {
            //msg para o usuário
            System.err.println("Objeto não foi instanciado " + ex.getMessage());
            //msg para o console do desenvolvedor
            ex.printStackTrace();

        } catch (ArithmeticException ex) {
            //msg para o console do desenvolvedor
            ex.printStackTrace();
            
            System.err.println("Operação matemática");
        }
    }

}
