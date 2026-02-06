package exercicios.review.c.domain;

public class Administrador implements Autenticavel{
    private String usuario;
    private String senha;
    private boolean autenticacaoDuploFator;

    public Administrador(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        this.autenticacaoDuploFator = autenticacaoDuploFator;
    }

    @Override
    public boolean autenticar(String usuario, String senha) {
        boolean autenticado = this.usuario.equals(usuario) && this.senha.equals(senha);

        if (autenticado && autenticacaoDuploFator) {
            // Simula verificação de 2 fatores
            return verificarCodigoSeguranca();
        }

        return autenticado;
    }

    private boolean verificarCodigoSeguranca() {
        // Lógica de verificação de 2 fatores
        return true;
    }

    @Override
    public void alterarSenha(String novaSenha) {
        if (novaSenha.length() >= 8) {
            this.senha = novaSenha;
        }
    }

    public void desativarUsuario(UsuarioComum usuario) {
        System.out.println("Usuário " + usuario.getUsuario() + " desativado.");
    }

    public String getUsuario() {
        return usuario;
    }
}
