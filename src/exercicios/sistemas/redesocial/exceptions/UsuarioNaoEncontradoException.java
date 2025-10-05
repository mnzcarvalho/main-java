package exercicios.sistemas.redesocial.exceptions;

public class UsuarioNaoEncontradoException extends RedeSocialException {
    public UsuarioNaoEncontradoException(String usuarioId) {
        super("Usuário não encontrado: " + usuarioId);
    }
}
