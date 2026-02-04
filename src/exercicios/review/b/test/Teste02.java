package exercicios.review.b.test;

import exercicios.review.b.domain.NivelAcesso;

public class Teste02 {
    public static void main(String[] args) {
        System.out.println("Testando níveis de acesso...");

        for (NivelAcesso nivel : NivelAcesso.values()) {
            System.out.println("\n" + nivel.name());
            System.out.println("Pode ler? " + nivel.podeLer());
            System.out.println("Pode escrever? " + nivel.podeEscrever());
            System.out.println("Pode moderar? " + nivel.podeModerar());
            System.out.println("Pode administrar? " + nivel.podeAdministrar());
        }

        System.out.println("Teste Cenário específico");

        NivelAcesso visitante = NivelAcesso.VISITANTE;

        System.out.println("\nVisitante tentando escrever: " +
                (visitante.podeEscrever() ? "PERMITIDO" : "NEGADO"));


        NivelAcesso moderador = NivelAcesso.MODERADOR;
        System.out.println("\nModedador tentando moderar: " +
                (moderador.podeModerar() ? "PERMITIDO" : "NEGADO"));

        System.out.println("Moderador tentando administrar: " +
                (moderador.podeAdministrar() ? "PERMITIDO" : "NEGADO"));
    }


}
