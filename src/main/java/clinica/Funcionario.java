package clinica;

public abstract class Funcionario {
    public String nome;
    public String telefone;
    public String senha;

    public String getCpf() {
        return this.nome;
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

    public void mostrar() {
        System.out.println("########## FUNCIONARIO ##########");
        System.out.println("Nome:     " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha:    " + senha);
    }

}
