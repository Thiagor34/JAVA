package aula15;

public class ProdutoEstoque {

    private String nome;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setNome(String nome) {
        this.nome = nome != null ? nome.trim().toUpperCase() : nome;
    }

    public void adicionarEstoque(int estoque) {
        this.estoque += estoque;
        verificarEstoqueMinimo();
    }

    public void retirarEstoque(int estoque) {
        this.estoque -= estoque;
        verificarEstoqueMinimo();
    }

    private void verificarEstoqueMinimo() {
        if (this.estoque < 5) {
            System.out.println("Estoque baixo: " + this.getEstoque());
        }

    }
}
