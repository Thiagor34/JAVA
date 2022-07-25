package Atividade_POO;

public class Carro {

    private String fabricante;
    private String placa;
    private String modelo;
    private Cor cor;
    private double preco;

    public Carro(String fabricante, String placa, String modelo, Cor cor, double preco) {
        this.fabricante = fabricante;
        setPlaca(placa);
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    public void imprimeDados() {
        System.out.println("Fabricante = " + this.fabricante);
        System.out.println("Placa = " + this.placa);
        System.out.println("Modelo = " + this.modelo);
        System.out.println("Cor = " + this.cor);
        System.out.println("Preco = " + this.preco);
        System.out.println();
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void verificaPlaca(String placa) throws PlacaException {
        if (placa.length() < 7 || placa.length() > 8) {
            throw new PlacaException(" Placa com valor inválido! ");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
