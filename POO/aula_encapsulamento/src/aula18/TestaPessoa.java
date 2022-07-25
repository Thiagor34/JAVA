package aula18;

public class TestaPessoa {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("Thiago");
        pessoa.setTipoPessoa(TipoPessoa.PESSOA_FISICA);
        
        for (TipoPessoa tipo : TipoPessoa.values()) {
            System.out.println(tipo.name());
            System.out.println(tipo.ordinal());

        }

    }
}
