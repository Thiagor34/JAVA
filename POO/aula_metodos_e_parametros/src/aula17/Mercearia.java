package aula17;

public class Mercearia {

    private int qtdLaranjasVendidas;
    private double precoLaranjaVarejo;

    public Mercearia(int qtdLaranjasVendidas, double precoLaranjaVarejo) {
        setPrecoLaranjaVarejo(precoLaranjaVarejo);
        setQtdLaranjasVendidas(qtdLaranjasVendidas);
    }

    public double getReceitaBruta() {
        return getPrecoLaranjaVarejo() * getQtdLaranjasVendidas();
    }

    public double getQtdLaranjasVenderMetaReceita(int valorMeta) {
        return valorMeta / getPrecoLaranjaVarejo();
    }

    public int getQtdLaranjasVendidas() {
        return qtdLaranjasVendidas;
    }

    public void setQtdLaranjasVendidas(int qtdLaranjasVendidas) {
        this.qtdLaranjasVendidas = qtdLaranjasVendidas;
    }

    public double getPrecoLaranjaVarejo() {
        return precoLaranjaVarejo;
    }

    public void setPrecoLaranjaVarejo(double precoLaranjaVarejo) {
        this.precoLaranjaVarejo = precoLaranjaVarejo;
    }

}
