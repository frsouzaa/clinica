package clinica;

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

    public void setGenero(char genero) throws NullPointerException {
        if (genero==Character.MIN_VALUE) {
            throw new NullPointerException("Genero não pode ser vazio");
        }
        this.genero = genero;
    }

    public void setIdade(int idade) throws NullPointerException {
        if (idade < 0) {
            throw new NullPointerException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }


    public void cadastrar() {
        // todo
    }

    public String nomeCompleto() {
        String res = "";
        try {
            res = this.nome.toUpperCase() + "," +
            this.telefone + "," +
            this.genero + "," +
            this.cpf + "," +
            this.idade;
        } catch (Exception e) {
            res = "Objeto vazio, verifique";
            System.out.println(e.getMessage());
        }
        return res;
    }

    public void mostrar() {
        System.out.println("########## PACIENTE ##########");
        System.out.println("Nome:     " + nome);
        System.out.println("CPF:      " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Genero:   " + genero);
        System.out.println("Idade:    " + idade);
    }

}
