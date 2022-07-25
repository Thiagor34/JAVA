package aula26;

public class TestaRecibo {

    public static void main(String[] args) {

        FormatadorModeloA formatadorModeloA = new FormatadorModeloA();
        formatadorModeloA.setNomeEmpresa("Empresa");
        System.out.println(formatadorModeloA.gerarRecibo("Thiago", 15000.00, "02/06/2022", "pertubar o vizinho"));
    }
}
