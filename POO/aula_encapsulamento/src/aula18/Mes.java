package aula18;

public enum Mes {
    JANEIRO(1, 31),
    FEVEREIRO(2, 28),
    MARCO(3, 31),
    ABRIL(4, 30),
    MAIO(5, 31),
    JUNHO(6, 30),
    JULHO(7, 31),
    AGOSTO(8, 31),
    SETEMBRO(9, 30),
    OUTUBRO(10, 31),
    NOVEMBRO(11, 30),
    DEZEMBRO(12, 31);

    private int mes;
    private int qtdDias;

    Mes(int mes, int qtdDias) {
        this.mes = mes;
        this.qtdDias = qtdDias;
    }

    public static Mes findByMes(int mesEscolhido) {
        for (Mes m : values()) {
            if (m.getMes() == mesEscolhido) {
                return m;
            }
        }
        return null;
    }

    public int getMes() {
        return mes;
    }

    public int getQtdDias() {
        return qtdDias;
    }

}
