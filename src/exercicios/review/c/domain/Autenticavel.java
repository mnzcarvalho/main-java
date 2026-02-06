package exercicios.review.c.domain;

public interface Autenticavel {
    boolean autenticar(String usuario, String senha);
    void alterarSenha(String novaSenha);
}
