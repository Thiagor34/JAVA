package Interface;

public interface Transportavel {
    
    static final String UNIDADE_VOLUME = "cm3";
    String UNIDADE_PESO = "kg";

    public double getPeso();
    public double getVolume();
    public int getEmpilhamentoMaximo();
    
}
