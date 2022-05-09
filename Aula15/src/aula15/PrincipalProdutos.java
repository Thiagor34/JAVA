package aula15;

public class PrincipalProdutos {

    public static void main(String[] args) {

        Produto produto = new Produto();
        
        produto.valoresIniciais(19.80, "Extra Forte", "Caboclo");
        produto.imprime();        
        produto.aumentarPreco(25);
        produto.alterarPreco(26.00);
        produto.setDescricao("Extra Forte Torrado");
        produto.setMarca("Cabloco Intenso");
        produto.imprime();
        produto.aumentarPreco(10);

    }

}
