package clinica;
import java.time.LocalDate;

public class Receita extends Procedimento {
    public Consulta consulta;

    public Receita() {

    }

    public Receita( Consulta consulta, LocalDate data, String descritivo) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
    }

    public Consulta getConsulta() {
        return this.consulta;
    }

    public void setConsulta(Consulta consulta) throws NullPointerException {
        if (consulta==null) {
            throw new NullPointerException("Consulta não pode ser vazia");
        }
        this.consulta = consulta;
    }

    public void preescrever() {
        // todo
    }

    public void consultar() {
        // todo
    }

    public void mostrar() {
        super.mostrar();
        this.consulta.mostrar();
    }

}