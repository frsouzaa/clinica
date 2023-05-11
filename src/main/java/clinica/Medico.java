package clinica;

import java.time.LocalDate;

public class Medico extends Funcionario {
    public String crm;
    public String especialidade;
    
    public Medico() {

    }

    public Medico(String crm, String telefone, String especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.senha = senha;
    }
    
    public String getCrm() {
        return this.crm;
    }
    
    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setCrm(String crm) throws NullPointerException {
        if (crm==null) {
            throw new NullPointerException("CRM inválido");
        }
        this.crm = crm;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void emitirReceita(Consulta consulta) {
        Receita receita = new Receita(consulta, LocalDate.now(), "teste");
        receita.mostrar();
    }

    public void solicitarExame(Consulta consulta) {
        Exame exame = new Exame(consulta, LocalDate.now(), "teste");
        exame.mostrar();
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Especialidade: " + especialidade);
        System.out.println("CRM:           " + crm);
    }
    
}