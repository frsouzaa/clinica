package clinica;

import java.time.LocalDate;

public abstract class Procedimento {
    public LocalDate data;
    public String descritivo;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) throws NullPointerException {
        if (data.compareTo(LocalDate.now()) < 0 || data==null) {
            throw new NullPointerException("Data inválida");
        }
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void consultar() {
        // todo
    }

    public void mostrar() {
        System.out.println("########## RECEITA ##########");
        System.out.println("Data:       " + data.toString());
        System.out.println("Descritivo: " + descritivo);
    }

}
