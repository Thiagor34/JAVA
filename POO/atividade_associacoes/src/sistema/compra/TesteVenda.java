package sistema.compra;

import java.util.List;

public class TesteVenda {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Batata", "Batata lavada 1KG", 4.99, new byte[]{50}, "BAT12345");
        Produto produto2 = new Produto("Detergente", "Detergente Limpol 200 ML", 2.29, new byte[]{60}, "DET12346");
        Produto produto3 = new Produto("Arroz", "Arroz Parboilizado 5KG", 14.56, new byte[]{70}, "ARR12347");
        Produto produto4 = new Produto("Picanha", "Picanha bovina KG", 79.99, new byte[]{80}, "PIC12348");
        Produto produto5 = new Produto("Couve-Flor", "Couve-Flor UN", 4.11, new byte[]{90}, "COV12349");
        System.out.println("Código: " + produto1.getCodigo() + " Produto: "
                + produto1.getNome() + " Descrição: " + produto1.getDescricao()
                + " Preço: " + produto1.getPreco());
        System.out.println();

        Catalogo catalogo = new Catalogo();
        catalogo.produtos.add(produto1);
        catalogo.produtos.add(produto2);
        catalogo.produtos.add(produto3);
        catalogo.produtos.add(produto4);
        catalogo.produtos.add(produto5);
        System.out.println("------------------------------------");
        System.out.println("-    Encarte Produtos - Armazem    -");
        System.out.println("------------------------------------");
        for (Produto produto : catalogo.getProdutos()) {
            System.out.println(produto.getDescricao() + "  -  R$" + produto.getPreco());
        }
        System.out.println("------------------------------------");
        System.out.println("************************************");

        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(produto1, 2);
        carrinho.adicionar(produto2, 3);
        carrinho.adicionar(produto3, 7);
        carrinho.adicionar(produto4, 3);
        carrinho.adicionar(produto5, 1);
        carrinho.remover(produto4, 2);
        carrinho.remover(produto3, 2);

        List<ItemDeCompra> sacola = carrinho.getItens();
        System.out.println("------------------------------------");
        System.out.println("-        Carrinho de compra        -");
        System.out.println("-      Item       -       Qtd      -");
        System.out.println("------------------------------------");
        for (ItemDeCompra itemDeCompra : sacola) {
            System.out.println(itemDeCompra.getProduto().getDescricao()
                    + "  /  " + itemDeCompra.getQuantidade() + " UN");
        }
        System.out.println("------------------------------------");
        System.out.println("Valor total Compra:         R$" + carrinho.calcularTotal());
        System.out.println("------------------------------------");

        Cliente cliente1 = new Cliente("admin", 0, new byte[]{000});
        cliente1.setNome("Thiago Costa");
        cliente1.setCpf(123456789);
        cliente1.setSenha(new byte[]{127});

        System.out.println("Cliente: " + cliente1.getNome()
                + " CPF: " + cliente1.getCpf());
    }

}
