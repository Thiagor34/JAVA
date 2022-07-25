package reserva.passagem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Voo {

    private int numero;
    private int duracao;
    private Date data;
    private double precoBase;
    private int milha;
    List<Aeronave> aeronaves;
    private Cidade origem;
    private Cidade destino;

    public Voo(int numero, int duracao, Date data, double precoBase, int milha,
            List<Aeronave> aeronave, Cidade origem, Cidade destino) {
        this.numero = numero;
        this.duracao = duracao;
        this.data = data;
        this.precoBase = precoBase;
        this.milha = milha;
        this.aeronaves = aeronave;
        this.origem = origem;
        this.destino = destino;
    }

    public Voo(int numero, int duracao, double precoBase, int milha,
            Aeronave aeronave, Cidade origem, Cidade destino) {
        this.numero = numero;
        this.duracao = duracao;
        this.precoBase = precoBase;
        this.milha = milha;
        this.aeronaves = new ArrayList();
        this.origem = origem;
        this.destino = destino;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public int getMilha() {
        return milha;
    }

    public void setMilha(int milha) {
        this.milha = milha;
    }

    public List<Aeronave> getAeronave() {
        return aeronaves;
    }

    public void setAeronave(List<Aeronave> aeronave) {
        this.aeronaves = aeronave;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

}
