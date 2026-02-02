package exercicios.review.a.domain;

public class Biblioteca {
    private static int totalMateriais;

    public static int getTotalMateriais() {
        return totalMateriais;
    }

    public static void incrementarTotalMateriais(){
        totalMateriais++;
    }
}
