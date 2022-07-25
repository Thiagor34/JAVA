package br.com.senac.dao;

import br.com.senac.entidades.Endereco;
import java.util.List;

public interface EnderecoDAO {

    public void criar(Endereco endereco, long idPaciente) throws Exception;
    public Endereco alterar(Endereco endereco) throws Exception;
    public Endereco pesquisarPorId(long id) throws Exception;
    public List<Endereco> pesquisarTodosPacientes(long idPaciente) throws Exception;
    public void excluir(long id) throws Exception;

}
