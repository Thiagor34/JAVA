
package aula24;

public class TesteFuncionario {
    public static void main(String[] args) {
      
        Endereco end1 = new Endereco("Rua papagaio", 260);
        Funcionario f = new Funcionario("Thiago", "111111", end1);
        
        f.setNome("José");
        f.setEndereco(end1);
        f.setRg("22222222");
        f.getEndereco().setRua("arara");
        f.setSalario(2500);
        f.setCarteiraProfissional(99999999);
        f.setDataAdmissao("02/02/2021");
        f.imprime();
    }
    
}
