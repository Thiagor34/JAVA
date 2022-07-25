package aula18;

public class Carro {

    private String fabricante;
    private String placa;
    private int velocidade;
    
    public static int velocidadePermitida = 60;

    public Carro(String fabricante, String placa, int velocidade) {
        setFabricante(fabricante);
        setPlaca(placa);
        setVelocidade(velocidade);
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

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(int valor) {
        this.velocidade += valor;
        
    }

    public boolean ultrapassouLimite() {
        return velocidade > velocidadePermitida;
                
    }

}
