package aula16;

public class Produto {

    private String nome;
    private String marca;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void valoresIniciais(double preco, String nome) {
        valoresIniciais(preco, nome, null);
    }

    public void valoresIniciais(double preco, String nome, String marca) {        
        setPreco(preco);
        setNome(nome);
        setMarca(marca);
    }

    public void aumentarPreco(double porcentagem) {
        if (porcentagem > 0 ){
            System.out.println("Aumentar o preço em " + porcentagem + "%");
            porcentagem = 1 + (porcentagem/100);
            this.preco *= porcentagem;
            System.out.println("Novo preço: " + this.preco);
            
        } else  {
            System.out.println("Aumento tem que ser maior que Zero");
        }
    }

    public void aumentarPreco() {
        aumentarPreco(8);
    }

    public void imprimir() {
        System.out.println("--------------------------");
        System.out.println("Produto: " + this.nome);
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: " + this.preco);        
        System.out.println("--------------------------");
        System.out.println();
    }
}
