package aula18;

public class Turma {
    private String curso;
    private Periodo periodo;
    
    public Turma(String curso, Periodo periodo){
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
    
    
    
    
}
