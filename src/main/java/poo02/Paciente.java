package poo02;

public class Paciente {
    public String nome;
    public String cpf;
    public String telefone;
    public char genero;
    public int idade;
    
    public Paciente() {
    
    }
    
    public Paciente(String nome, String cpf, String telefone, char genero, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.idade = idade;
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

    public char getGenero() {
        return this.genero;
    }

    public int getIdade() {
        return this.idade;
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

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void cadastrar() {
        // todo
    }

    public void mostrar(boolean atributo) {
        String paragrafo = "";
        if (atributo) {
            paragrafo = "    ";
            System.out.println(paragrafo + "#### PACIENTE ####");
        } else {
            System.out.println("\n\n########## PACIENTE ##########");
        }
        System.out.println(paragrafo + "Nome:     " + nome);
        System.out.println(paragrafo + "CPF:      " + cpf);
        System.out.println(paragrafo + "Telefone: " + telefone);
        System.out.println(paragrafo + "Genero:   " + genero);
        System.out.println(paragrafo + "Idade:    " + idade);
    }

}
