
package aula17;

public class PrincipalMercearia {
    public static void main(String[] args) {
        
        Mercearia laranja = new Mercearia(50, 0.65);
        System.out.println("Receita Bruta: R$ " + laranja.getReceitaBruta());
        System.out.println("Qtd Laranjas para Meta: " + laranja.getQtdLaranjasVenderMetaReceita(1000));
    }
    
}
