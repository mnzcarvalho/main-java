package exercicios.sistemas.redesocial.interfaces;

import exercicios.sistemas.redesocial.entities.Usuario;

public interface Notificavel {
    void enviarNotificacao(Usuario destinatario, String mensagem);
    String getTipoNotificacao();

}
