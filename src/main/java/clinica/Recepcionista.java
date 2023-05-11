package clinica;

import java.time.LocalDate;

public class Recepcionista extends Funcionario {
    public String cpf;

    public Recepcionista() {

    }

    public Recepcionista(String cpf, String telefone) {
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) throws NullPointerException {
        if (cpf==null || cpf.length()!=11) {
            throw new NullPointerException("CPF inválido");
        }
        this.cpf = cpf;
    }

    public void acessar() {
        // todo
    }

    public void cadastrarPaciente(Paciente paciente) {
        paciente.mostrar();
    }

    public void marcarConsulta(Medico medico, Paciente paciente) {
        Consulta consulta = new Consulta(LocalDate.now(), "23:59:00", medico, paciente, "teste", "teste");
        consulta.mostrar();
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("CPF:      " + cpf);
    }
}