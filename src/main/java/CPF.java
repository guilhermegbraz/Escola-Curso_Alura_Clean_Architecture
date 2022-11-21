public class CPF {

    private String numero;

    public CPF(String cpf) {
        if(! isValid(cpf)) throw new IllegalArgumentException("CPF invalid");

        this.numero = cpf;
    }

    private boolean isValid(String cpf) {
        String pattern = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}";

        return cpf.matches(pattern);
    }
}
