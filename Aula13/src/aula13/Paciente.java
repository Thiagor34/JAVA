package aula13;
public class Paciente {
    double peso;
    double altura;
    
    double calcularIMC(){
        return peso / (altura * altura);
    }
}
