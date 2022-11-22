package Escola.dominio.aluno;

import java.util.List;

public class Aluno {

    //ENTIDADE (termo genérico que pode significar coisas diferentes em contexto diferentes):
    //JPA -> classe que espelha uma relação do banco de dados
    //CLEAN ARCHITECTURE -> camada com as regras de negocios

    private CPF CPF;
    private String nome;
    private Email email;

    private List<Telefone> telefones;

    protected void setCPF(Escola.dominio.aluno.CPF CPF) {
        this.CPF = CPF;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setEmail(Email email) {
        this.email = email;
    }

    public Escola.dominio.aluno.CPF getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public Email getEmail() {
        return email;
    }

    public void adicionarTelefone(String DDD, String numero ) {
        this.telefones.add(new Telefone(DDD, numero));
    }
}


