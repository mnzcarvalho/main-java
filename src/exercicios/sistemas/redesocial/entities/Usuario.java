package exercicios.sistemas.redesocial.entities;

import exercicios.sistemas.redesocial.enums.TipoUsuario;

import java.time.LocalDateTime;

public class Usuario {
    private String id;
    private String nome;
    private String email;
    private LocalDateTime dataCadastro;
    private TipoUsuario tipo;

    public Usuario() {
        this.dataCadastro = LocalDateTime.now();
        this.tipo = TipoUsuario.USUARIO_COMUM;
        this.id = gerarId();
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.id = gerarId();
    }
    private String gerarId(){
        return "USER " + System.currentTimeMillis();
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nome='" + nome;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
}