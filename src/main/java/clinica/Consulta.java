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