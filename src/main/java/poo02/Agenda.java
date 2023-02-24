package poo02;
import java.time.LocalDate;

public class Agenda {
    public LocalDate data;
    public String hora;
    public Medico medico;
    public Paciente paciente;

    public Agenda() {

    }

    public Agenda(LocalDate data, String hora, Medico medico, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDate getData() {
        return this.data;
    }

    public String getHora() {
        return this.hora;
    }
    
    public Medico getMedico() {
        return this.medico;
    }
    
    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void mostrar() {
        System.out.println("\n\n########## AGENDA ##########");
        System.out.println("Data:     " + data.toString());
        System.out.println("Hora:     " + hora);
        this.medico.mostrar(true);
        this.paciente.mostrar(true);
    }

}