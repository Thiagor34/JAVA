package br.com.senac.dao;

import br.com.senac.entidades.Paciente;
import java.util.List;

public interface PacienteDAO {
    
    public Paciente criar(Paciente paciente) throws Exception;
    public Paciente alterar(Paciente paciente) throws Exception;
    public Paciente pesquisarPorId(long id) throws Exception;
    public List<Paciente> pesquisarTodos() throws Exception;
    public void excluir(long id) throws Exception;
}
