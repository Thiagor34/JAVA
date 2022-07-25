package aula13;
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        ExemploMetodos exemploMetodos = new ExemploMetodos();
        Carro carro = new Carro();
        Paciente paciente = new Paciente();
        
        //exemplo um classe ExemploMetodos
        
        exemploMetodos.calculaFrete();        
        exemploMetodos.getNome();        
        exemploMetodos.imprime();
        
        //exemplo dois dlasse Carro
        
        carro.faricante = "Honda";
        carro.modelo = "Fit";
        carro.cor = "Prata";
        System.out.println("\n" + carro.faricante + " " + carro.modelo + " Cor " + carro.cor + "\n");
        carro.ligar();
        carro.acelerar();
        carro.mudarMarcha();
        carro.frear();
        carro.desligar();
        
        //exemplo três classe Paciente
        
        paciente.peso = 106;
        paciente.altura = 1.83;        
        paciente.calcularIMC();
        System.out.println("");
        System.out.printf("IMC: %.2f " ,paciente.calcularIMC());
        
        
    }
    
}
