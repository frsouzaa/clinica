package poo02;
import java.time.LocalDate;

public class Receita {
    public String consulta;
    public LocalDate data;
    public String descritivo;

    public Receita() {

    }

    public Receita( String consulta, LocalDate data, String descritivo) {
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

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void preescrever() {
        // todo
    }

    public void consultar() {
        // todo
    }

    public void mostrar() {
        System.out.println("\n\n########## RECEITA ##########");
        System.out.println("Data:       " + data.toString());
        System.out.println("Consulta:   " + consulta);
        System.out.println("Descritivo: " + descritivo);
    }

}