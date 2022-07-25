package aula21;

public class TestaPessoa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        try {
            Endereco enderecoPessoa = new Endereco();
            pessoa.adicionarEndereco(null);
            
        } catch (NullPointerException e) {
            pessoa.adicionarEndereco(new Endereco());
            System.err.println(e.getMessage());
        }
    }

}
