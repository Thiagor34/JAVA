package Interface;

public class TesteAlimento {

    public static void main(String[] args) {

        Alimento alimento = new Alimento(5, 7, "Hamburguer", 25, 200, 250);

        System.out.println("Produto: " + alimento.getNome());
        System.out.println("Peso em Gramas: " + alimento.getPesoGramas());
        System.out.println("Volume em cm3: " + alimento.getVolumeCm3());
        System.out.println("Temperatura: " + alimento.getTemperaturaDeConservacao());
        System.out.println("Empilhamento Max: " + alimento.getEmpilhamentoMaximo());
        System.out.println("Dias de Validade : " + alimento.getDiasDeValidade());

    }

}
