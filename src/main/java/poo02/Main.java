package poo02;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("teste", "00000000000", "00 00000000", 'M', 0);
        Medico medico = new Medico("teste", "00000000000", "00 00000000", "teste", "teste");
        Recepcionista recpcionista = new Recepcionista("teste", "00000000000", "00 00000000", "teste");
        Agenda agenda = new Agenda(LocalDate.now(), "00:00:00", medico, paciente);
        Consulta consulta = new Consulta(LocalDate.now(), "00:00:00", medico, paciente, "teste", "teste");
        Receita receita = new Receita("teste", LocalDate.now(), "teste");
        Exame exame = new Exame("teste", LocalDate.now(), "teste");

        paciente.mostrar(false);
        medico.mostrar(false);
        recpcionista.mostrar();
        agenda.mostrar();
        consulta.mostrar();
        receita.mostrar();
        exame.mostrar();
    }

}