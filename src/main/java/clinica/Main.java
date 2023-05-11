package clinica;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import clinica.DAO.MedicoDAO;
import clinica.DAO.ReceitaDAO;
import clinica.DAO.ExameDAO;
import clinica.DAO.RecepcionistaDAO;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Programa iniciou");

        Paciente paciente = new Paciente("teste", "00000000000", "00 00000000", 'M', 0);
        Medico medico = new Medico("00000000000", "00 00000000", "teste");
        medico.setNome("teste");
        medico.setSenha("teste00teste00");
        Recepcionista recepcionista = new Recepcionista("00000000000", "00 00000000");
        recepcionista.setNome("teste");
        recepcionista.setSenha("teste00teste00");
        Agenda agenda = new Agenda(LocalDate.now(), "00:00:00", medico, paciente);
        Consulta consulta = new Consulta(LocalDate.now(), "00:00:00", medico, paciente, "teste", "teste");
        Receita receita = new Receita(consulta, LocalDate.now(), "teste");
        Exame exame = new Exame(consulta, LocalDate.now(), "teste");

        MedicoDAO medicoDAO = new MedicoDAO();
        medicoDAO.create(medico);
        medico.setEspecialidade("Nova Especialidade");
        medicoDAO.update(medico, medico.getCrm());
        Medico m1 = medicoDAO.read(medico.getCrm());
        m1.mostrar();
        medicoDAO.delete(medico.getCrm());

        ReceitaDAO receitaDAO = new ReceitaDAO();
        receitaDAO.create(receita);
        receita.setData(LocalDate.now());
        receitaDAO.update(receita, receita.getDescritivo());
        Receita receita1 = receitaDAO.read(receita.getDescritivo());
        receita1.mostrar();
        receitaDAO.delete(receita.getDescritivo());

        ExameDAO exameDAO = new ExameDAO();
        exameDAO.create(exame);
        exame.setData(LocalDate.now());
        exameDAO.update(exame, exame.getDescritivo());
        Exame exame1 = exameDAO.read(exame.getDescritivo());
        exame1.mostrar();
        exameDAO.delete(exame.getDescritivo());

        RecepcionistaDAO recepcionistaDAO = new RecepcionistaDAO();
        recepcionistaDAO.create(recepcionista);
        recepcionista.setTelefone("11 978326453");
        recepcionistaDAO.update(recepcionista, recepcionista.getCpf());
        Recepcionista recepcionista1 = recepcionistaDAO.read(recepcionista.getCpf());
        recepcionista1.mostrar();
        recepcionistaDAO.delete(recepcionista.getCpf());

//        JanelaPaciente janelaPaciente = new JanelaPaciente();
//        JanelaMedico janelaMedico = new JanelaMedico();
//        JanelaReceita janelaReceita = new JanelaReceita();
//        JanelaRecepcionista janelaRecepcionista = new JanelaRecepcionista();
//        JanelaExame janelaExame = new JanelaExame();
    }

}