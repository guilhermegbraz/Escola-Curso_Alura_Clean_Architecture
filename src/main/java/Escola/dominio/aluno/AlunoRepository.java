package Escola.dominio.aluno;

import java.util.List;

public interface AlunoRepository {

    void matricular(Aluno aluno);

    Aluno buscarPorCPF(CPF cpfAluon);

    List<Aluno> listarTodosOsAlunosMatriculados();


}
