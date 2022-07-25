
import br.com.ecommerce.entidades.ClientePF;
import br.com.ecommerce.entidades.ClientePJ;
import br.com.ecommerce.enums.TipoCliente;
import br.com.ecommerce.exception.ValorInvalidoException;
import br.com.ecommerce.servicos.TelaMenu;
import br.com.ecommerce.servicos.TelaCliente;
import br.com.ecommerce.operacao.CatalogoDoce;
import br.com.ecommerce.operacao.ListaCompra;
import br.com.ecommerce.operacao.Operacao;
import br.com.ecommerce.operacao.Produto;
import java.util.List;

public class LojaDoce {

    public static void main(String[] args) {
        TelaMenu.imprimirInicio();
        TelaMenu.imprimirMenu();
        TelaMenu.imprimirLinha();

        //instanciando produtos
        Produto boloCenoura = new Produto("Bolo Cenoura   ", "Bolo Cenoura integral com calda cremosa de chocolate",
                "Doces Costa", 7.50, "Pote");
        Produto boloSensacao = new Produto("Bolo Sensação  ", "Bolo Sensação integral recheado com Morango e creme de chocolate",
                "Doces Costa", 8.50, "Pote");
        Produto boloMineiro = new Produto("Bolo Mineiro   ", "Bolo Mineiro integral recheado com doce de limão",
                "Doces Costa", 6.75, "Pote");
        Produto doceBeijinho = new Produto("Doce Beijinho  ", "Doce de leite condensado com coco e cravo",
                "Doces Costa", 3.25, "Unidade");
        Produto doceBrigadeiro = new Produto("Doce Brigadeiro", "Doce de leite condensado com chocolate e granulado",
                "Doces Costa", 3.75, "Unidade");
        Produto doceCajuzinho = new Produto("Doce Cajuzinho ", "Doce de leite condensado com amendoin e chocolate",
                "Doces Costa", 3.50, "Unidade");
        Produto mouseMaracuja = new Produto("Mouse Maracujá ", "Mouse sabor maracujá com polpa de fruta",
                "Doces Costa", 5.00, "Pote");
        Produto mouseMorango = new Produto("Mouse Morango  ", "Mouse sabor morango com polpa de fruta",
                "Doces Costa", 5.00, "Pote");

        //instanciando Catálogo de doces e adicionando os produtos
        CatalogoDoce catalogoDoce = new CatalogoDoce();
        catalogoDoce.produtos.add(boloCenoura);
        catalogoDoce.produtos.add(boloSensacao);
        catalogoDoce.produtos.add(boloMineiro);
        catalogoDoce.produtos.add(doceBeijinho);
        catalogoDoce.produtos.add(doceBrigadeiro);
        catalogoDoce.produtos.add(doceCajuzinho);
        catalogoDoce.produtos.add(mouseMaracuja);
        catalogoDoce.produtos.add(mouseMorango);
        /*
        for (Produto produto : catalogoDoce.getProdutos()) {
            System.out.println(produto.getNome() + " / "
                    + produto.getDescricao() + " / "
                    + produto.getMarca() + " / "
                    + produto.getUnidade() + " / R$ " 
                    + produto.getPreco());
        }
         */

        //instanciando Cliente Pessoa Física
        try {
            ClientePF clientePF = new ClientePF("123.456.789-25", "Thiago", "Costa",
                    "1234 5678 9012 3456", TipoCliente.PESSOA_FISICA);

            TelaCliente.pulaLinha();
            TelaCliente.pulaLinha();
            System.out.println("Venda para Pessoa Física: ");
            TelaCliente.imprimirPF();
            System.out.printf("%13s %7s", "Nome: " + clientePF.getNome() + " " + clientePF.getSobrenome(),
                    "   CPF: " + clientePF.getCpf() + "\nCartão Crédito: " + clientePF.getCartaoCredito() + "\n");
            TelaCliente.imprimirCabecalho();

        } catch (IllegalArgumentException ex) {
            System.out.println("Objeto vazio, favor verificar com suporte! " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Objeto nulo, favor verificar com suporte! " + ex.getMessage());
        } 

        //instanciando operaçãoPF e utilizando os métodos de adicionar e remover 
        Operacao operacaoPF = new Operacao();
        try {
            operacaoPF.adicionarProduto(boloCenoura, 3);
            operacaoPF.adicionarProduto(boloSensacao, 5);
            operacaoPF.adicionarProduto(boloMineiro, 2);
            operacaoPF.adicionarProduto(doceBeijinho, 7);
            operacaoPF.adicionarProduto(doceBrigadeiro, 10);
            operacaoPF.adicionarProduto(doceCajuzinho, 20);
            operacaoPF.adicionarProduto(mouseMaracuja, 2);
            operacaoPF.adicionarProduto(mouseMorango, 3);
            operacaoPF.removerProduto(doceCajuzinho, 16);
        } catch (ValorInvalidoException ex) {
            System.out.println(ex.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println("Objeto vazio, favor verificar com suporte! " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Objeto nulo, favor verificar com suporte! " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Entre em contato com o suporte! " + ex.getMessage());
        }

        //instanciando uma sacola de compras da Pessoa Física
        List<ListaCompra> sacolaPF = operacaoPF.getItens();
        for (ListaCompra listaCompra : sacolaPF) {
            System.out.format("%10s %7d" + "          R$ " + "%.2f %n",
                    listaCompra.getProduto().getNome(),
                    listaCompra.getQuantidade(),
                    listaCompra.getProduto().getPreco() * listaCompra.getQuantidade());
        }

        System.out.println("Total                           R$ "
                + operacaoPF.calcularTotal(TipoCliente.PESSOA_FISICA));
        operacaoPF.finalizarCompra();

        //instanciando Cliente Pessoa Jurídica
        try {
            ClientePJ clientePJ = new ClientePJ("12.345.678/0001-00", "Merc", "Azul",
                    "9876 5432 1012 3456", TipoCliente.PESSOA_JURIDICA);

            System.out.println("Venda para Pessoa Jurídica 10% desconto: ");
            TelaCliente.imprimirPJ();
            System.out.printf("%13s %7s", "Nome: " + clientePJ.getNome() + " " + clientePJ.getSobrenome(),
                    " CNPJ: " + clientePJ.getCnpj() + "\nCartão Crédito: " + clientePJ.getCartaoCredito() + "\n");
            TelaCliente.imprimirCabecalho();

        } catch (IllegalArgumentException ex) {
            System.out.println("Objeto vazio, favor verificar com suporte! " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Objeto nulo, favor verificar com suporte! " + ex.getMessage());
        }

        //instanciando operaçãoPJ e utilizando os métodos de adicionar e remover 
        Operacao operacaoPJ = new Operacao();
        try {
            operacaoPJ.adicionarProduto(boloCenoura, 30);
            operacaoPJ.adicionarProduto(boloSensacao, 50);
            operacaoPJ.adicionarProduto(boloMineiro, 20);
            operacaoPJ.adicionarProduto(doceBeijinho, 70);
            operacaoPJ.adicionarProduto(doceBrigadeiro, 100);
            operacaoPJ.adicionarProduto(doceCajuzinho, 200);
            operacaoPJ.adicionarProduto(mouseMaracuja, 20);
            operacaoPJ.adicionarProduto(mouseMorango, 30);
            operacaoPJ.removerProduto(doceCajuzinho, 150);

        } catch (ValorInvalidoException ex) {
            System.out.println(ex.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println("Valor vazio, favor verificar com suporte! " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Valor nulo, favor verificar com suporte! " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Entre em contato com o suporte! " + ex.getMessage());
        }

        //instanciando uma sacola de compras da Pessoa Jurídica
        List<ListaCompra> sacolaPJ = operacaoPJ.getItens();
        for (ListaCompra listaCompra : sacolaPJ) {
            System.out.format("%10s %7d" + "         R$ " + "%.2f %n",
                    listaCompra.getProduto().getNome(),
                    listaCompra.getQuantidade(),
                    listaCompra.getProduto().getPreco() * listaCompra.getQuantidade());
        }

        System.out.println("Total                          R$ "
                + operacaoPJ.calcularTotal(TipoCliente.PESSOA_JURIDICA));
        operacaoPJ.finalizarCompra();

    }

}
