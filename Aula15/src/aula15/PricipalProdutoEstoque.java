package aula15;

public class PricipalProdutoEstoque {
    public static void main(String[] args) {
        
        ProdutoEstoque produto = new ProdutoEstoque();
        
        produto.setNome("Arroz");
        produto.getNome();
        System.out.println(produto.getNome());
        produto.adicionarEstoque(7);
        System.out.println(produto.getEstoque());
        produto.retirarEstoque(6);
        produto.getEstoque();
    }
    
}
