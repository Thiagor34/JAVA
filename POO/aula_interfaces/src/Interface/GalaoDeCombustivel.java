package Interface;

public class GalaoDeCombustivel implements Inflamavel {

    private String nomeCombustivel;
    private double densidade;
    private int temperaturaTransporte;

    public GalaoDeCombustivel(String nomeCombustivel, double densidade,
            int temperaturaTransporte) {
        this.nomeCombustivel = nomeCombustivel;
        this.densidade = densidade;
        this.temperaturaTransporte = temperaturaTransporte;
    }
    
    public String getNomeCombustivel() {
        return nomeCombustivel;
    }

    public void setNomeCombustivel(String nomeCombustivel) {
        this.nomeCombustivel = nomeCombustivel;
    }

    public double getDensidade() {
        return densidade;
    }

    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }

    public int getTemperaturaTransporte() {
        return temperaturaTransporte;
    }

    public void setTemperaturaTransporte(int temperaturaTransporte) {
        this.temperaturaTransporte = temperaturaTransporte;
    }
    
    
    @Override
    public int getTemperaturaMaxima() {
        return (int) (temperaturaTransporte * 1.4);
    }

    @Override
    public double getPeso() {
        double pesoGramas = getVolume() * densidade;
        return pesoGramas / 1000;
    }

    @Override
    public double getVolume() {
        return 3785;
    }

    @Override
    public int getEmpilhamentoMaximo() {
        return 3;
    }

}
