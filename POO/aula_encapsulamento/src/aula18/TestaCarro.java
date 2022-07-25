
package aula18;

public class TestaCarro {
    public static void main(String[] args) {
       
        System.out.println("Velocidade máxima permitida: " + Carro.velocidadePermitida + "\n");
        Carro carro = new Carro("Ford", "MJJ 0303", 35);
        carro.acelerar(10);
        
        System.out.println("Fabricante: " + carro.getFabricante());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Velocidade: " + carro.getVelocidade());
        System.out.println("Ultrapassou limite: " + carro.ultrapassouLimite());
    }
    
}
 