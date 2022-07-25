
package aula21dois;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Departamento> departamentos;
    private List <Escritorio> escritorios;

    public Empresa() {
        departamentos = new ArrayList<>();
        escritorios = new ArrayList<>();
    }
    

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public List<Escritorio> getEscritorios() {
        return escritorios;
    }

    public void setEscritorios(List<Escritorio> escritorios) {
        this.escritorios = escritorios;
    }
    
    
    
}
