package exercicios.review.c.domain;

public class UsuarioComum implements Autenticavel{
    private String usuario;
    private String senha;

    public UsuarioComum(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }

    @Override
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    public String getUsuario() {
        return usuario;
    }
}
