
package aula16;

public class PrincipalGerente {

    public static void main(String[] args) {
        // TODO code application logic here
        Gerente gerente = new Gerente();
        
        gerente.setNome("José");
        System.out.println(gerente.getNome());
        gerente.setSalario(7250.50);
        System.out.println(gerente.getSalario());
        gerente.aumentarSalario(0.5);
        //gerente.aumentarSalario();
        System.out.println("Salário Atualizado: " + gerente.getSalario());
         
    }
    
}
