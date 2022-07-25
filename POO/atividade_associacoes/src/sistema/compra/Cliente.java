package sistema.compra;

public class Cliente {

    private String nome;
    private long cpf;
    private byte[] senha;

    public Cliente(String nome, long cpf, byte[] senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public byte[] getSenha() {
        return senha;
    }

    public void setSenha(byte[] senha) {
        this.senha = senha;
    }

}
