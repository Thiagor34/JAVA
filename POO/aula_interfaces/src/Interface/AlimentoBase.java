package Interface;

public abstract class AlimentoBase {

    private String nome;
    private int temperatura;
    private int pesoGramas;
    private double volumeCm3;

    public AlimentoBase(String nome, int temperatura, int pesoGramas, double volumeCm3) {
        this.nome = nome;
        this.temperatura = temperatura;
        this.pesoGramas = pesoGramas;
        this.volumeCm3 = volumeCm3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getPesoGramas() {
        return pesoGramas;
    }

    public void setPesoGramas(int pesoGramas) {
        this.pesoGramas = pesoGramas;
    }

    public double getVolumeCm3() {
        return volumeCm3;
    }

    public void setVolumeCm3(double volumeCm3) {
        this.volumeCm3 = volumeCm3;
    }

}
