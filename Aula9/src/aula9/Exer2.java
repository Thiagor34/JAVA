package aula9;
public class Exer2 {
    public static void main(String[] args) {
        
        int[] umArray = {5,10,15,20,25};
        
        System.out.printf("%s%8s\n", "Índice", "Valor");
        
        for (int contador = 0; contador < umArray.length; contador++) {
            int valorPosicao = umArray[contador];
            
            System.out.printf("%5s%8s\n", contador, valorPosicao);
            
        }
        
    }
    
}
