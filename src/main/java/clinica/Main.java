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

        // try {
        //     paciente.setCpf("123");
        // } catch (Exception e) {
        //     logger.log(Level.WARNING, e.getMessage());
        // }

        // try {
        //     medico.setCrm(null);
        // } catch (Exception e) {
        //     logger.log(Level.WARNING, e.getMessage());
        // }

        // try {
        //     recepcionista.setSenha("123");
        // } catch (Exception e) {
        //     logger.log(Level.WARNING, e.getMessage());
        // }

        // try {
        //     agenda.setData(LocalDate.of(2022, 02, 02));
        // } catch (Exception e) {
        //     logger.log(Level.WARNING, e.getMessage());
        // }

        // try {
        //     agenda.setData(LocalDate.of(2022, 02, 02));
        // } catch (Exception e) {
        //     logger.log(Level.WARNING, e.getMessage());
        // }

        // try {
        //     agenda.setData(LocalDate.of(2022, 02, 02));
        // } catch (Exception e) {
        //     logger.log(Level.WARNING, e.getMessage());
        // }

        // try {
        //     agenda.setData(LocalDate.of(2022, 02, 02));
        // } catch (Exception e) {
        //     logger.log(Level.WARNING, e.getMessage());
        // }
        
        System.out.println("\n");
        paciente.mostrar();

        System.out.println("\n");
        medico.mostrar();

        System.out.println("\n");
        recepcionista.mostrar();

        System.out.println("\n");
        agenda.mostrar();

        System.out.println("\n");
        consulta.mostrar();

        System.out.println("\n");
        receita.mostrar();

        System.out.println("\n");
        exame.mostrar();

        // logger.log(Level.INFO, "Cadastrando paciente...");
        // recepcionista.cadastrarPaciente(new Paciente("Paciente Cadastrado", "11122233344", "11 00000000", 'F', 77));
        // logger.log(Level.INFO, "Paciente cadastrado com sucesso!");

        // logger.log(Level.INFO, "Marcando consulta...");
        // recepcionista.marcarConsulta(medico, paciente);
        // logger.log(Level.INFO, "Consulta marcada com sucesso!");

        // logger.log(Level.INFO, "Emitindo receita...");
        // medico.emitirReceita(consulta);
        // logger.log(Level.INFO, "Receita emitida com sucesso!");

        // logger.log(Level.INFO, "Solicitando exame...");
        // medico.solicitarExame(consulta);
        // logger.log(Level.INFO, "Exame solicitado com sucesso!");
    }

}