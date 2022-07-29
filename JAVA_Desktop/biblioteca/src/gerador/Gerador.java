package gerador;

public class Gerador {

    public static String gerarNumero(int qtd) {
        String numero = "";

        for (int i = 0; i < qtd; i++) {
            numero += (int) (Math.random() * 10);
        }
        return numero;
    }
    

    public static String gerarCpf() {
        String cpf = gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) 
                + "-" + gerarNumero(2);
        return cpf;
    }

    public static String gerarTelefoneFixo() {
        String telefone = "(48)3" + gerarNumero(3) + "-" + gerarNumero(4);
        return telefone;
    }

    public static String gerarTelefoneMovel() {
        String telefoneMovel = "(48)9" + gerarNumero(4) + "-" + gerarNumero(4);
        return telefoneMovel;
    }

    public static void main(String[] args) {
        System.out.println(gerarNumero(7));
        System.out.println(gerarTelefoneFixo());
        System.out.println(gerarTelefoneMovel());
        System.out.println(gerarCpf());
    }
}
