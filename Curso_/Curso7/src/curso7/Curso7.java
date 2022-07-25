package curso7;

import javax.swing.JOptionPane;

public class Curso7 {

    public static void main(String[] args) {
        // TODO code application logic here
        int n =0 , s = 0, contP = 0, contI = 0, contM = 0, contT = 0;
        double m = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um Número: <br><em>[0 para sair]</em> </html>"));
            s += n;
            if (n % 2 == 0){
                contP += 1;
            } else {
                contI += 1;
            }
            if (n >= 100){
                contM += 1;
            }
            contT += 1;
            
            m = s / contT;
                       
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final<hr>Somatório: " + s + 
                "<br>Total nº digitados: " + contT + 
                "<br>Total Pares: " + contP + 
                "<br>Total Impares: " + contI + 
                "<br>Total nºs Acima de 100: " + contM +
                "<br>Média de Valores: " + m + "</html>");
    }
}
