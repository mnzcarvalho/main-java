package exercicios.sistemas.sistemabiblioteca.core.modelo;

public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + this.nome + '\'' +
                ", email='" + this.email + '\'' +
                '}';
    }
}
