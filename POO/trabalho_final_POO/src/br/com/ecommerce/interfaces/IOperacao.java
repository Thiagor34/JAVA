package br.com.ecommerce.interfaces;

import br.com.ecommerce.enums.TipoCliente;
import br.com.ecommerce.operacao.Produto;

public interface IOperacao {

    public double precoVenda();

    public void adicionarProduto(Produto prod, int quantidade) throws Exception;

    public void removerProduto(Produto prod, int quantidade) throws Exception;

    public double calcularTotal(TipoCliente tipo);

    public void finalizarCompra();

}
