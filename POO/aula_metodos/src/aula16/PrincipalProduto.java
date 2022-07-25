
package aula16;

public class PrincipalProduto {
    public static void main(String[] args) {
        
        Produto produto = new Produto();
        produto.valoresIniciais(10.00, "Meia", "ABC");
        produto.imprimir();
        produto.aumentarPreco();
        //produto.aumentarPreco(25);
        produto.imprimir();

    }
    
}
