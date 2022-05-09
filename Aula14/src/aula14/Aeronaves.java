package aula14;
public class Aeronaves {
    int totalAssentos;
    int assentosReservados;
    
    public void reservarAssentos(int numerosAssentos){
        this.assentosReservados += numerosAssentos;        
    }
    
    public int calcularAssentosDisponiveis(){
        return this.totalAssentos - this.assentosReservados;        
    }    
}

