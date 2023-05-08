package clinica;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Programa iniciou");

        Paciente paciente = new Paciente("teste", "00000000000", "00 00000000", 'M', 0);
        Medico medico = new Medico("teste", "00000000000", "00 00000000", "teste", "teste");
        Recepcionista recepcionista = new Recepcionista("teste", "00000000000", "00 00000000", "teste");
        Agenda agenda = new Agenda(LocalDate.now(), "00:00:00", medico, paciente);
        Consulta consulta = new Consulta(LocalDate.now(), "00:00:00", medico, paciente, "teste", "teste");
        Receita receita = new Receita(consulta, LocalDate.now(), "teste");
        Exame exame = new Exame(consulta, LocalDate.now(), "teste");

        JanelaPaciente janelaPaciente = new JanelaPaciente();
//        JanelaMedico janelaMedico = new JanelaMedico();
//        JanelaReceita janelaReceita = new JanelaReceita();
//        JanelaRecepcionista janelaRecepcionista = new JanelaRecepcionista();
//        JanelaExame janelaExame = new JanelaExame();
    }

}