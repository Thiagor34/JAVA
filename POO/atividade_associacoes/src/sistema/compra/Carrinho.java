package sistema.compra;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private Cliente cliente;
    List<ItemDeCompra> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }

    public void adicionar(Produto prod, int qtd) {
        ItemDeCompra itemCompra = new ItemDeCompra(qtd, prod);
        itens.add(itemCompra);
    }

    public void remover(Produto prod, int qtd) {
        for (ItemDeCompra item : itens) {
            if (item.getProduto().equals(prod)) {
                item.setQuantidade(item.getQuantidade() - qtd);
            }
        }
    }

    public void eliminar(Produto prod) {
        for (ItemDeCompra item : itens) {
            if (item.getProduto().equals(prod)) {
                itens.remove(item);
            }
        }
    }

    public double calcularTotal() {
        double total = 0.00;
        for (ItemDeCompra item : itens) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        return total;
    }

    public ItemDeCompra buscaItem(Produto prod) {
        for (ItemDeCompra item : itens) {
            if (item.getProduto().equals(prod)) {
                return item;
            }
        }
        return null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemDeCompra> getItens() {
        return this.itens;
    }

    public void setItens(List<ItemDeCompra> itens) {
        this.itens = itens;
    }

}
