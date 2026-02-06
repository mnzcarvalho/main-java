package exercicios.review.c.domain;

public class EmailNotificacao implements Notificavel{
    private String emailDestinatario;

    public EmailNotificacao(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("NOTIFICAÇÃO POR EMAIL");
        System.out.println("Para: " + emailDestinatario);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Email enviado com sucesso!");
        System.out.println();
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }
}
