package poo02;

public class Medico {
    public String nome;
    public String crm;
    public String telefone;
    public String especialidade;
    public String senha;
    
    public Medico() {

    }

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) {        
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.senha = senha;
    }
    
    public String getCrm() {
        return this.crm;
    }

    public String getTelefone() {
        return this.telefone;
    }
    
    public String getEspecialidade() {
        return this.especialidade;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getSenha() {
        return this.senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void acessar() {
        // todo
    }

    public void mostrar(boolean atributo) {
        String paragrafo = "";
        if (atributo) {
            paragrafo = "    ";
            System.out.println(paragrafo + "#### MEDICO ####");
        } else {
            System.out.println("\n\n########## MEDICO ##########");
        }
        System.out.println(paragrafo + "Nome:          " + nome);
        System.out.println(paragrafo + "CRM:           " + crm);
        System.out.println(paragrafo + "Telefone:      " + telefone);
        System.out.println(paragrafo + "Especialidade: " + especialidade);
        System.out.println(paragrafo + "Senha:         " + senha);
    }
    
}