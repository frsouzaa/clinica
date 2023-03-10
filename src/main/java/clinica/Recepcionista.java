package clinica;

import java.time.LocalDate;

public class Recepcionista {
    public String nome;
    public String cpf;
    public String telefone;
    public String senha;

    public Recepcionista() {

    }

    public Recepcionista(String nome, String cpf, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public String getSenha() {
        return this.senha;
    }

    public void setNome(String nome) throws NullPointerException {
        if (nome==null) {
            throw new NullPointerException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }
    
    public void setCpf(String cpf) throws NullPointerException {
        if (cpf==null || cpf.length()!=11) {
            throw new NullPointerException("CPF inválido");
        }
        this.cpf = cpf;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setSenha(String senha) throws NullPointerException {
        if (senha==null || senha.length() < 13) {
            throw new NullPointerException("Senha fraca");
        }
        this.senha = senha;
    }

    public void acessar() {
        // todo
    }

    public void cadastrarPaciente(Paciente paciente) {
        paciente.mostrar(false);
    }

    public void marcarConsulta(Medico medico, Paciente paciente) {
        Consulta consulta = new Consulta(LocalDate.now(), "23:59:00", medico, paciente, "teste", "teste");
        consulta.mostrar(false);
    }

    public void mostrar() {
        System.out.println("\n\n########## RECEPCIONISTA ##########");
        System.out.println("Nome:     " + nome);
        System.out.println("CPF:      " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha:    " + senha);
    }
}