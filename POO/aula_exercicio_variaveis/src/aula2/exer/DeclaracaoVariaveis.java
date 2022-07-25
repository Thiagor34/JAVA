/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2.exer;

/**
 *
 * @author Thiago
 */
public class DeclaracaoVariaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "Thiago";
        int idade = 35;
        String regGeral = "1.234.567";
        char sexo = 'M';
        double salario = 15000.00;
        String resultado = "Senhor, de anos, portador do RG de número, do sexo,"
                + " está registrado com salário de R$"; //só para usar o StringBuilder
                
        System.out.println("Senhor " + nome + ", de " + idade + " anos, portador"
                + " do RG de número " + regGeral + ", do sexo " + sexo + ", está"
                + " registrado com salário de R$ " + salario);    //concatenando normal
        
        System.out.printf("Senhor %s, de %d anos, portador do RG de número %s, "
                + "do sexo %c, está registrado com salário de R$ %.2f", nome, 
                idade, regGeral, sexo, salario);      //metodo printf
        
        
        StringBuilder builder = new StringBuilder();
        builder.append("\nSenhor ").append(nome);
        builder.append(", de ").append(idade);
        builder.append(" anos, portador do RG de número ").append(regGeral);
        builder.append(", do sexo ").append(sexo);
        builder.append(", está registrado com salário de R$ ").append(salario);
        
        System.out.print(builder.toString());
    }
    
}
