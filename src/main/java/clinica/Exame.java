package clinica;
import java.time.LocalDate;

public class Exame {
    public String consulta;
    public LocalDate data;
    public String descritivo;

    public Exame() {

    }

    public Exame(String consulta, LocalDate data, String descritivo) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
    }

    public String getConsulta() {
        return this.consulta;
    }
    
    public LocalDate getData() {
        return this.data;
    }
    
    public String getDescritivo() {
        return this.descritivo;
    }

    public void setConsulta(String consulta) throws NullPointerException {
        if (consulta==null) {
            throw new NullPointerException("Consulta não pode ser vazia");
        }
        this.consulta = consulta;
    }
    
    public void setData(LocalDate data) throws NullPointerException {
        if (data.compareTo(LocalDate.now()) < 0 || data==null) {
            throw new NullPointerException("Data inválida");
        }
        this.data = data;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void solicitar() {
        // todo
    }

    public void consultar() {
        // todo
    }

    public void mostrar() {
        System.out.println("\n\n########## EXAME ##########");
        System.out.println("Data:       " + data.toString());
        System.out.println("Consulta:   " + consulta);
        System.out.println("Descritivo: " + descritivo);
    }

}