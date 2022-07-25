package reserva.passagem;

import java.util.ArrayList;
import java.util.List;

public class TestePrograma {

    public static void main(String[] args) {

        CartaoFidelidade visa = new CartaoFidelidade("1234 5678 9012 3456", 2500, CategoriaCartao.GOLD);

        Passageiro thiago = new Passageiro("Thiago", "Costa", false, visa);

        Cidade saoJose = new Cidade(-3, "São José", 1, "Brasil");
        Cidade beberibe = new Cidade(-3, "Beberibe", 2, "Brasil");

        Categoria economica = new Categoria("Classe Econômica", 500.00);
        Categoria primeira = new Categoria("Primeira Classe", 2000.00);

        Assento assento1 = new Assento("A1 Janela", primeira);
        Assento assento2 = new Assento("B3 Corredor", economica);
        List<Assento> assentoBoeing = new ArrayList();
        assentoBoeing.add(assento1);
        assentoBoeing.add(assento2);

        Aeronave boeing = new Aeronave(260, "Boeing", 01723, "Embraer", assentoBoeing);

        Voo gol = new Voo(171, 5, 2500.00, 180, boeing, saoJose, beberibe);

        PagamentoCartaoCredito pagamentoCartaoCredito = new PagamentoCartaoCredito("Cartão Crédito");

        Reserva reserva = new Reserva(1001, 14062022, 15062022, gol, thiago, StatusReserva.CONFIRMADA, pagamentoCartaoCredito);

        Bilhete bilhete = new Bilhete(assento1, reserva);

        System.out.println("Passageiro: " + bilhete.getPassageiro().getNome()
                + " " + bilhete.getPassageiro().getSobrenome());
        System.out.println("Tipo Pagamento: " + pagamentoCartaoCredito.getTipoPagamento());
        System.out.println("Cartão Fidelidade: " + visa.getNumero() + " " + visa.getCategoria());
        System.out.println("---------------------------------------------");
        System.out.println("Status Reserva: " + reserva.getStatus());
        System.out.println("Categoria: " + economica.getNome());
        System.out.println("Assento: " + assento2.getPosicao());
        System.out.println("Origem: " + bilhete.getVoo().getOrigem().getNome()
                + " - Destino: " + bilhete.getVoo().getDestino().getNome());
        System.out.println("---------------------------------------------");
    }
}
