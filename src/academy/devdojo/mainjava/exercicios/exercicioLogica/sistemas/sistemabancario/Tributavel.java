package academy.devdojo.mainjava.exercicios.exercicioLogica.sistemas.sistemabancario;

public interface Tributavel {
    public static final double TAXA_BASE = 0.0038;

    double calcularTributo();

    static String getInfoTributacao() {
        return "Sistema Tributário Brasileiro";
    }
}
