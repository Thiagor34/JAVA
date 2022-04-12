package aula9;
public class Exer1 {
    public static void main(String[] args) {
        float[] pesoProd = new float[10];
        pesoProd[0] = 10.2f;
        pesoProd[4] = 98;
        pesoProd[9] = 30.5f;
        
        for (float i: pesoProd) {
                    System.out.println("Peso = " + i);
        }
    }
}
