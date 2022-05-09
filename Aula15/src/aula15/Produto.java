package aula15;

public class Produto {

    private String descricao;
    private String marca;
    private double preco;

    public String getDescricao() {
        return this.descricao;
    }

    public String getMarca() {
        return this.marca;
    }
    
    public double preco(){
        return preco;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao != null ? descricao.trim().toUpperCase() : descricao;  // .trim() remove o espaço do final      
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void alterarPreco(double novoPreco){
        if (novoPreco > 0){
        this.preco = novoPreco; 
        }
    }
    
    public void aumentarPreco(double porcentagem){
        if (porcentagem > 0){
        System.out.println("\nAumentando preço em " + porcentagem + "%");
        this.preco += this.preco*(porcentagem/100);
            System.out.println("Novo Preço: " + this.preco);
        } else { 
            System.out.println("Valor não aumentado!");
        }
    }
    
    public void imprime(){
        System.out.printf("\nDescrição: %s \nMarca: %s \nPreço: %.2f\n", this.descricao, this.marca, this.preco);        
    }
    
    public void valoresIniciais(double umPreco, String umaDescricao, String umaMarca){
        alterarPreco(umPreco);
        setDescricao(umaDescricao);
        setMarca(umaMarca);
    }
    
    /*
    public boolean isVendido(){
        return vendido;
    }
    
    public void setVendido(boolean vendido){
        this.vendido = vendido;
    }
    */

}
