package reserva.passagem;

import java.util.List;

public class Aeronave {

    private int capacidade;
    private String modelo;
    private long codigoFAB;
    private String fabricante;
    private List<Assento> assento;

    public Aeronave(int capacidade, String modelo, long codigoFAB, String fabricante, List<Assento> assento) {
        this.capacidade = capacidade;
        this.modelo = modelo;
        this.codigoFAB = codigoFAB;
        this.fabricante = fabricante;
        this.assento = assento;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getCodigoFAB() {
        return codigoFAB;
    }

    public void setCodigoFAB(long codigoFAB) {
        this.codigoFAB = codigoFAB;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public List<Assento> getAssento() {
        return assento;
    }

    public void setAssento(List<Assento> assento) {
        this.assento = assento;
    }

}
