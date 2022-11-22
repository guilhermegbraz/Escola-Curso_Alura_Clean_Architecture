package Escola.dominio.aluno;

public class FabricaDeAluno {

    private Aluno aluno;

    public FabricaDeAluno criarAluno() {
        this.aluno = new Aluno();

        return this;
    }

    public FabricaDeAluno adicionarNome(String nome) {
        this.aluno.setNome(nome);

        return this;
    }

    public FabricaDeAluno adicionarCPF(String CPF) {
        this.aluno.setCPF(new CPF(CPF));
        return this;
    }

    public FabricaDeAluno adicionarEmail(String email) {
        this.aluno.setEmail(new Email(email));
        return this;
    }
    public FabricaDeAluno adicionarTelefone(String DDD, String numero) {
        this.aluno.adicionarTelefone(DDD, numero);

        return this;
    }

    public Aluno getAluno() {
        if (this.aluno.getCPF() == null ||
                this.aluno.getEmail() == null ||
                this.aluno.getNome() == null) {
            throw new IllegalArgumentException("Todo aluno deve ter nome, cpf e email setado");
        }
            return this.aluno;
    }

}
