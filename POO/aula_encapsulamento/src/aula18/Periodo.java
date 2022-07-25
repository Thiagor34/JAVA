package aula18;

public enum Periodo {
    DIURNO_INTEGRAL("Seg à Sex", 10, 18),
    DIURNO_MATUTINO("Seg à Sex", 8, 12),
    NOTURNO ("Seg à Sex", 19, 23);
    
    private String dia;
    private int horasInicio;
    private int horasTermino;

    Periodo(String dia, int horasInicio, int horasTermino) {
        this.dia = dia;
        this.horasInicio = horasInicio;
        this.horasTermino = horasTermino;
    }    
    
    public String getDias(){
        return dia;        
    }
    
    public int getHoraInicio(){
        return horasInicio;
    }
    
    public int getHoraTermino(){
        return horasTermino;
    }
    
    public int getTotalPeriodo(){
        return horasTermino - horasInicio;        
    }

}
