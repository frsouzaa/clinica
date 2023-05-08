package clinica;

import java.time.LocalDate;
import java.util.List;

public class Consulta extends Agenda {
    public String motivo;
    public String historico;
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

    public String getMotivo() {
        return this.motivo;
    }

    public String getHistorico() {
        return this.historico;
    }

    public List<Receita> getReceitas() {
        return this.receitas;
    }

    public List<Exame> getExames() {
        return this.exames;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
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

    public void mostrar() {
        System.out.println("########## Consulta ##########");
        System.out.println("Motivo:    " + motivo);
        System.out.println("Historico: " + historico);
        System.out.println("Data:      " + data.toString());
        System.out.println("Hora:      " + hora);
        this.paciente.mostrar();
        this.medico.mostrar();
    }
}