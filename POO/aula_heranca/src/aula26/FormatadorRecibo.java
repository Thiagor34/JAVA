package aula26;

public abstract class FormatadorRecibo {

    private String nomeEmpresa;

    public abstract String gerarRecibo(String nomeCliente, double valor, String data, String motivo);

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    
}
