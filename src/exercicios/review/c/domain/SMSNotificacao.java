package exercicios.review.c.domain;

public class SMSNotificacao implements Notificavel{
    private String telefoneDestinatario;

    public SMSNotificacao(String telefoneDestinatario) {
        this.telefoneDestinatario = telefoneDestinatario;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("NOTIFICAÇÃO POR SMS");
        System.out.println("Para: " + telefoneDestinatario);

        if (mensagem.length() > 160) {
            mensagem = mensagem.substring(0, 157) + "...";
            System.out.println("AVISO: Mensagem truncada para 160 caracteres");
        }

        System.out.println("Mensagem: " + mensagem);
        System.out.println("SMS enviado com sucesso");
        System.out.println();
    }

    public String getTelefoneDestinatario() {
        return telefoneDestinatario;
    }

    public void setTelefoneDestinatario(String telefoneDestinatario) {
        this.telefoneDestinatario = telefoneDestinatario;
    }
}
