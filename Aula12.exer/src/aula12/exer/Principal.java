
package aula12.exer;

public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        
        pessoa.nome = "Thiago";
        pessoa.sobrenome = "Costa";
        pessoa.cpf = "123.456.789-10";
        pessoa.rg = "1.234.567";
        pessoa.telefones.add("123456789");
        pessoa.telefones.add("987654321");

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Sobrenome: " + pessoa.sobrenome);
        System.out.println("CPF: " + pessoa.cpf);
        System.out.println("RG: " + pessoa.rg);
        System.out.println("Telefone: " + pessoa.telefones);
        
    }
    
}
