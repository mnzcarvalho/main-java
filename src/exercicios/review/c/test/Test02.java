package exercicios.review.c.test;

import exercicios.review.c.domain.Administrador;
import exercicios.review.c.domain.Autenticavel;
import exercicios.review.c.domain.UsuarioComum;

public class Test02 {
    public static void main(String[] args) {
        Autenticavel usuario = new UsuarioComum("joao", "337");
        Administrador adm = new Administrador("admin", "admin123");

        System.out.println("Usuário autenticado: " + usuario.autenticar("joao", "123456"));
        System.out.println("Admin autenticado: " + adm.autenticar("admin", "admin123"));

        System.out.println("===============================");
        usuario.alterarSenha("123456");
        System.out.println("Usuário autenticado: " + usuario.autenticar("joao", "123456"));


        System.out.println("\n===============================");

        UsuarioComum comum = (UsuarioComum) usuario;
        adm.desativarUsuario(comum);
    }
}
