package Atividade_POO;

import java.util.ArrayList;
import java.util.List;

public class TestaCarro {

    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>() {
            {
                add(new Carro("Ford", "MJE0001", "Fusion", Cor.CINZA, 120000.00));
                add(new Carro("Renault", "TAC9800", "Kwid", Cor.VERMELHO, 60000.00));
                add(new Carro("Fiat", "QPR120034", "Mobi", Cor.VERMELHO, 53000.00));
                add(new Carro("Fiat", "ABC0007", "Palio", Cor.CINZA, 35000.00));
                add(new Carro("Hyundai", "BBC9988", "HB20", Cor.BRANCO, 51000.00));
                add(new Carro("Nissan", "QJJ500566", "Kicks", Cor.PRETO, 90000.00));
            }
        };

        for (Carro carro : carros) {
            try {
                carro.verificaPlaca(carro.getPlaca());
            } catch (PlacaException ex) {
                System.out.println("Carro " + carro.getModelo() + ex.getMessage());
            }
            carro.imprimeDados();
        }
    }

}
