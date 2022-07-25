package br.com.ecommerce.operacao;

import br.com.ecommerce.interfaces.IOperacao;
import br.com.ecommerce.entidades.Cliente;
import br.com.ecommerce.enums.TipoCliente;
import br.com.ecommerce.exception.ValorInvalidoException;
import java.util.ArrayList;
import java.util.List;

public class Operacao implements IOperacao {

    private Cliente cliente;
    private List<ListaCompra> itens;

    public Operacao() {
        itens = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ListaCompra> getItens() {
        return itens;
    }

    public void setItens(List<ListaCompra> itens) {
        this.itens = itens;
    }

    @Override
    public double precoVenda() {
        return calcularTotal(TipoCliente.PESSOA_FISICA);
    }

    @Override
    public void adicionarProduto(Produto prod, int quantidade) throws ValorInvalidoException, NullPointerException {
        ListaCompra lista = new ListaCompra(quantidade, prod);
        if (quantidade <= 0) {
            throw new ValorInvalidoException("Valor não pode ser menor ou igual a zero!");
        }
        itens.add(lista);
    }

    @Override
    public void removerProduto(Produto prod, int quantidade) throws ValorInvalidoException, NullPointerException {
        for (ListaCompra item : itens) {
            if (item.getProduto().equals(prod)) {
                if (quantidade >= 1 && item.getQuantidade() > quantidade) {
                    item.setQuantidade(item.getQuantidade() - quantidade);
                } else {
                    throw new ValorInvalidoException("Valor não pode ser maior que total ou menor/igual a zero!");
                }
            }
        }
    }

    @Override
    public double calcularTotal(TipoCliente tipo) {
        double total = 0.00;

        try {
            for (ListaCompra item : itens) {
                total += item.getProduto().getPreco() * item.getQuantidade();
            }
            switch (tipo) {
                case PESSOA_FISICA:
                    total = total;
                    break;
                case PESSOA_JURIDICA:
                    total *= 0.9;
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (ArithmeticException ex) {
            System.out.println("Operação matemática incorreta! " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Valor nulo, verifique a operação! " + ex.getMessage());
        }
        return total;
    }

    @Override
    public void finalizarCompra() {
        System.out.println("-----------------------------------------");
        System.out.println("Aguardando confirmação de pagamento......");
        System.out.println(".............       Pagamento confirmado!");
        System.out.println("Obrigado pela Preferência!");
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println();
    }

}
