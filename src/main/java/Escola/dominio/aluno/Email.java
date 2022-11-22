package Escola.dominio.aluno;

public class Email {
    //VALUE OBJECT

    private String endereco;

    public Email(String email) throws IllegalArgumentException{
        if(!isValid(email)) throw new IllegalArgumentException("Escola.dominio.aluno.Email is invalid");

        this.endereco = email;
    }
    private boolean isValid(String email) {
        String patter = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        return email.matches(patter);
    }
}
