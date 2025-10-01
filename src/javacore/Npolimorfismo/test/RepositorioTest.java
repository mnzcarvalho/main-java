package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.repositorio.Repositorio;
import javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        //mais genérico >> mais específico
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
