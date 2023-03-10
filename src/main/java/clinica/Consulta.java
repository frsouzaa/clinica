package clinica;
import java.time.LocalDate;
import java.util.List;

public class Consulta {
    public LocalDate data;
    public String hora;
    public String motivo;
    public String historico;
    public Medico medico;
    public Paciente paciente;
    public Agenda agenda;
    public List<Receita> receitas;
    public List<Exame> exames;

    public Consulta() {

    }

    public Consulta(LocalDate data, String hora, Medico medico, Paciente paciente, String motivo, String historico) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
        this.motivo = motivo;
        this.historico = historico;
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

    public String getMotivoo() {
        return this.motivo;
    }

    public String getHistorico() {
        return this.historico;
    }

    public Agenda getAgenda() {
        return this.agenda;
    }

    public List<Receita> getReceitas() {
        return this.receitas;
    }

    public List<Exame> getExames() {
        return this.exames;
    }

    public void setData(LocalDate data) throws NullPointerException {
        if (data.compareTo(LocalDate.now()) < 0 || data==null) {
            throw new NullPointerException("Data inválida");
        }
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMedico(Medico medico) throws NullPointerException {
        if (medico==null) {
            throw new NullPointerException("Médico não pode ser vazio");
        }
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) throws NullPointerException {
        if (paciente==null) {
            throw new NullPointerException("Paciente não pode ser vazio");
        }
        this.paciente = paciente;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public void marcar() {
        // todo
    }

    public void cancelar() {
        // todo
    }

    public void realizar() {
        // todo
    }

    public void atualizar() {
        // todo
    }

    public void mostrar(boolean atributo) {
        String paragrafo = "";
        if (atributo) {
            paragrafo = "    ";
            System.out.println(paragrafo + "#### Consulta ####");
        } else {
            System.out.println("\n\n########## Consulta ##########");
        }
        System.out.println(paragrafo + "Data:      " + data.toString());
        System.out.println(paragrafo + "Hora:      " + hora);
        this.medico.mostrar(true);
        this.paciente.mostrar(true);
        System.out.println(paragrafo + "Motivo:    " + motivo);
        System.out.println(paragrafo + "Historico: " + historico);
    }
}