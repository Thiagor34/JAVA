package br.com.senac.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Gerador {

    public static String gerarNumero(int qtd) {
        String numero = "";

        for (int i = 0; i < qtd; i++) {
            numero += (int) (Math.random() * 10);
        }
        return numero;
    }

    public static String gerarCpf() {
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3)
                + "-" + gerarNumero(2);
    }

    public static String gerarCNPJ() {
        return gerarNumero(2) + "." + gerarNumero(3) + "." + gerarNumero(3)
                + "/" + gerarNumero(4) + "-" + gerarNumero(2);
    }

    public static String gerarSenha(int qtd) {
        String[] caracteres = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a",
            "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C",
            "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
            "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "$", "_", "%", "&", "#"};
        String senha = "";

        for (int i = 0; i < qtd; i++) {
            int indice = (int) (Math.random() * caracteres.length);
            senha += caracteres[indice];
        }
        return senha;
    }

    public static String gerarTelefoneFixo() {
        return "(48)3" + gerarNumero(3) + "-" + gerarNumero(4);
    }

    public static String gerarTelefoneMovel() {
        return "(48)9" + gerarNumero(4) + "-" + gerarNumero(4);
    }

    public static String gerarCEP() {
        return gerarNumero(5) + "-" + gerarNumero(3);
    }

    public static String gerarNome() {
        List<String> nomes = Arrays.asList("Ana", "Claudia", "Daniel", "Fernando", "Luiz",
                "Maria", "Pedro", "Samanta", "Thiago", "Veronica");
        Collections.shuffle(nomes);
        return nomes.get(0) + " " + gerarSobrenome();
    }

    private static String gerarSobrenome() {
        List<String> sobrenomes = Arrays.asList("Abreu", "Costa", "Dutra", "Ferreira", "Lima",
                "Mattos", "Paiva", "Silva", "Teixeira", "Varela");
        Collections.shuffle(sobrenomes);
        return sobrenomes.get(0);
    }

    private static String gerarIdade() {
        String numero = "";
        return numero += (int) (Math.random() * (65 - 18 + 1) + 18);
      }

    public static String gerarLogin() {
        List<String> nomes = Arrays.asList("Ana", "Claudia", "Daniel", "Fernando", "Luiz",
                "Maria", "Pedro", "Samanta", "Thiago", "Veronica");
        Collections.shuffle(nomes);
        return "@" + nomes.get(0).toLowerCase();
    }

    public static String gerarCidade() {
        List<String> cidades = Arrays.asList("Bento Gonçalves", "Curitiba", "Diamantina", "Florianópolis", "Gramado",
                "Maceió", "Palhoça", "São José", "São Paulo", "Tiradentes");
        Collections.shuffle(cidades);
        return cidades.get(0);
    }

    public static String gerarBairro() {
        List<String> bairros = Arrays.asList("ABC", "Bairro Ipiranga", "Delfinópolis", "Faria Lima", "Leblon",
                "Massaranduba", "Paiolzinho", "Santa Clara", "Trindade", "Ratones");
        Collections.shuffle(bairros);
        return bairros.get(0);
    }

    public static String gerarUF() {
        String[] ufLista = {"AC", "AL", "AM", "AP", "BA", "CE", "DE", "ES", "GO", "MA",
            "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR",
            "RS", "SC", "SE", "SP", "TO"};

        return ufLista[(int) (Math.random() * ufLista.length)];
    }

    public static double gerarSalario() {
        return Double.parseDouble(gerarNumero(4));
    }
}
