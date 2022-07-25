package aula17;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(validarMes(mes));
        setAno(ano);
    }

    public Data(int dia, int mes) {
        this(dia, mes, 2022);
    }

    private int validarDia(int dia) {
  
        int[] dias = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        if (dia > 0 && dia <= dias[this.mes]){
            return dia;
            } else {
            System.out.println("Dia inválido, alterado para 1.");
            return 1;
        }

    }

    private int validarMes(int mes) {
        if (mes > 0 && mes <= 12){
            return mes;            
        } else {
            System.out.println("Mês inválido, alterado para 1.");
            return 1;
        }

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
