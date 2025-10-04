package exercicios.sistemas.sistemabiblioteca.core.modelo;

public class Funcionario extends  Pessoa{
    private String cargo;

    public Funcionario(String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }

    @Override
    public String getTipo() {
        return "Funcionário (" + cargo + ")";    }
}
