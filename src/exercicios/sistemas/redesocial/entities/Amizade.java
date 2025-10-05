package exercicios.sistemas.redesocial.entities;

import exercicios.sistemas.redesocial.enums.StatusAmizade;

import java.time.LocalDateTime;

public final class Amizade {
    private final String id;
    private final Usuario usuario1;
    private final Usuario usuario2;
    private final LocalDateTime dataSolicitacao;
    private StatusAmizade status;
    private LocalDateTime dataResposta;

    public Amizade(Usuario usuario1, Usuario usuario2) {
        this.id = "FRIEND_" + System.currentTimeMillis();
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        this.dataSolicitacao = LocalDateTime.now();
        this.status = StatusAmizade.PENDENTE;
    }

    public final void aceitar(){
        this.status = StatusAmizade.ACEITO;
        this.dataResposta = LocalDateTime.now();
    }
    public final void recusar(){
        this.status = StatusAmizade.BLOQUEADO;
        this.dataResposta = LocalDateTime.now();

    }

    public String getId() {
        return id;
    }

    public Usuario getUsuario1() {
        return usuario1;
    }

    public Usuario getUsuario2() {
        return usuario2;
    }

    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public StatusAmizade getStatus() {
        return status;
    }

    public LocalDateTime getDataResposta() {
        return dataResposta;
    }
}
