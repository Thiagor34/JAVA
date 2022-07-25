
package aula18;

public class TestaPeriodo {
    public static void main(String[] args) {
        
        Turma turma = new Turma("java", Periodo.DIURNO_INTEGRAL);
        
        System.out.println("Curso: " + turma.getCurso());
        System.out.println("Hora início: " + turma.getPeriodo().getHoraInicio());
        System.out.println("Hora término: " + turma.getPeriodo().getHoraTermino());
    }
    
}
