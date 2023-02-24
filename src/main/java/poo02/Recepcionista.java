package poo02;

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

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void acessar() {
        // todo
    }

    public void mostrar() {
        System.out.println("\n\n########## RECEPCIONISTA ##########");
        System.out.println("Nome:     " + nome);
        System.out.println("CPF:      " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha:    " + senha);
    }


}