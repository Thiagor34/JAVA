package br.com.senac.entidades;

import br.com.senac.dao.EnderecoDAO;
import br.com.senac.dao.PacienteDAO;
import br.com.senac.dao.impl.PacienteDAOImpl;
import java.time.LocalDate;
import java.time.Month;
import br.com.senac.dao.impl.EnderecoDAOImpl;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        try {
            PacienteDAO daoPaciente = new PacienteDAOImpl();
            EnderecoDAO daoEndereco = new EnderecoDAOImpl();

            //lista de Pacientes
            List<Paciente> pacientes = new ArrayList();

            //instanciando Pacientes
            Paciente pacienteUm = new Paciente("José", "001.001.001-01", LocalDate.of(2000, Month.MARCH, 31));
            Paciente pacienteDois = new Paciente("Ana", "002.002.002-02", LocalDate.of(2007, Month.JULY, 13));
            Paciente pacienteTres = new Paciente("Pedro", "003.003.003-03", LocalDate.of(1989, Month.DECEMBER, 25));

            //adicionando Pacientes na lista
            pacientes.add(pacienteUm);
            pacientes.add(pacienteDois);
            pacientes.add(pacienteTres);

            //instanciando Endereços
            Endereco primeira = new Endereco("88888-88", "Rua primeira", 10);
            Endereco segunda = new Endereco("88888-89", "Rua segunda", 20);
            Endereco terceira = new Endereco("88888-90", "Rua terceira", 30);
            Endereco quarta = new Endereco("88888-91", "Rua quarta", 40);
            Endereco quinta = new Endereco("88888-92", "Rua quinta", 50);

            //Setando endereço nos pacientes
            pacienteUm.getEnderecos().add(primeira);
            pacienteDois.getEnderecos().add(segunda);
            pacienteTres.getEnderecos().add(terceira);
            pacienteDois.getEnderecos().add(quarta);
            pacienteTres.getEnderecos().add(quinta);

            //criando Pacientes e Endereço no Banco
            System.out.println("Criando Pacientes e Endereços no Banco.... \n");
            for (Paciente paciente : pacientes) {
                daoPaciente.criar(paciente);
                for (Endereco endereco : paciente.getEnderecos()) {
                    daoEndereco.criar(endereco, paciente.getId());
                }
                System.out.println("Nome: " + paciente.getNome() + " ID = " + paciente.getId() + " // Lista endereços: " + daoEndereco.pesquisarTodosPacientes(paciente.getId()));
            }
            System.out.println("\nPacientes e Endereços Criados!");         

            //atualizando informações Pacientes
            System.out.println("\nAtualizando Informações Paciente... ");
            pacienteUm.setNome("José Maria");
            pacienteUm.setCpf("005.005.005-05");
            pacienteUm.setNascimento(LocalDate.of(1965, Month.FEBRUARY, 28));
            daoPaciente.alterar(pacienteUm);
            System.out.println("\nInformações atualizadas!");

            //excluindo Endereços
            System.out.println("\nExcluindo endereços.... ");
            pacientes = daoPaciente.pesquisarTodos();

            for (Paciente paciente : pacientes) {
                paciente.setEnderecos(daoEndereco.pesquisarTodosPacientes(paciente.getId()));
                for (Endereco endereco : paciente.getEnderecos()) {
                    if (paciente.getId() == 3) {
                        daoEndereco.excluir(endereco.getId());
                    }
                }
            }
            System.out.println("Endereços excluídos!");

            //excluindo Paciente 
            System.out.println("\nExcluindo Paciente.... ");
            daoPaciente.excluir(3);
            System.out.println("Paciente excluído! ");

        } catch (Exception ex) {
            System.out.println("Não conectou: " + ex.getMessage());
        }
    }
}
