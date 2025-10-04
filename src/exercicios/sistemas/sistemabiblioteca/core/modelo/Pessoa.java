package exercicios.sistemas.sistemabiblioteca.core.modelo;

public abstract class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return getTipo() + ": " + this.nome + " | Email: " + this.email;
    }
}
