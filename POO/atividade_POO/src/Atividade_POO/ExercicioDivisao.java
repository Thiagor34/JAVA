package Atividade_POO;

import javax.swing.JOptionPane;

public class ExercicioDivisao {

    public static void main(String[] args) {
        boolean continuar = true;

        do {
            String num = JOptionPane.showInputDialog("Numerador: ");
            String den = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(num), Integer.parseInt(den));
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                continuar = false;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Não é permitido inserir letras, informe apenas números inteiros! " + ex.getMessage());
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(null, "O número do divisor deve ser diferente de Zero. " + ex.getMessage());
            }
        } while (continuar);
    }

    public static int dividir(int num, int den) {
        return num / den;
    }
}
