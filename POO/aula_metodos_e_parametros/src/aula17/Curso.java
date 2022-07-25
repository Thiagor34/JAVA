
package aula17;

public class Curso {
    private String nome;
    private String descricao;
    private String codigo;
    private int cargaHoraria;
    
    public Curso(String nome,String descricao,String codigo, int cargaHoraria){
    setNome(nome);
    setDescricao(descricao);
    setCodigo(codigo);
    setCargaHoraria(cargaHoraria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    } 
   
}
