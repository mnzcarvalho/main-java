package exercicios.sistemas.sistemabiblioteca.core.modelo;

import exercicios.sistemas.sistemabiblioteca.core.interfaces.Notificavel;

public class Usuario extends Pessoa implements Notificavel {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        super(nome, email);
    }


    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return "";
    }

    @Override
    public String toString() {
        return "Usuario";
    }

    @Override
    public void enviarNotificação(String mensagem) {
        System.out.println("Enviando email para: " + getEmail() + ": " + mensagem);
    }
}
