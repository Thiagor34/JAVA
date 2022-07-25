
package Interface;

public class TesteMobilia {
    public static void main(String[] args) {
        
        Mobilia mobilia = new Mobilia("mesa", "koerich", "compensado", 115, 70, 90,11);
        
        System.out.println("Mobilia " + mobilia.getTipo());
        System.out.println("Volume " + mobilia.getVolume() + Transportavel.UNIDADE_VOLUME);
        System.out.println("Peso " +  mobilia.getPeso() + Transportavel.UNIDADE_PESO);
        System.out.println("Empilhamento Max: " + mobilia.getEmpilhamentoMaximo());
    }
    
}
