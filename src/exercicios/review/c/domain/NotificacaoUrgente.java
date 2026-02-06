package exercicios.review.c.domain;

public class NotificacaoUrgente implements Notificavel, Priorizavel {

    private String destinatario;
    private String canal;    // "email", "sms", "todos"
    private int prioridade;

    public NotificacaoUrgente(String destinatario, String canal, int prioridade) {
        this.destinatario = destinatario;
        this.canal = canal;
        this.prioridade = prioridade;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("NOTIFICAÇÃO URGENTE");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Canal: " + canal);
        System.out.println("Prioridade: " + prioridade + " (máxima: 10)");

        mensagem = "[URGENTE] " + mensagem;

        if (canal.equalsIgnoreCase("email") || canal.equalsIgnoreCase("todos")) {
            System.out.println("Enviando mensagem por email: " + mensagem);
        }

        if (canal.equalsIgnoreCase("sms") || canal.equalsIgnoreCase("todos")) {
            System.out.println("Enviando mensagem por SMS: " + mensagem);
        }

        System.out.println("Notificação urgente processada!");
        System.out.println();
    }

    @Override
    public int getPrioridade() {
        return prioridade;
    }

    public boolean isAltaPrioridade(){
        return prioridade >= 8;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
