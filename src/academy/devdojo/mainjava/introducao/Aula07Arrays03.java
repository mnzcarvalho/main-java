package academy.devdojo.mainjava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes [0] = "Goku" ;
        nomes [1] = "Naruto";
        nomes [2] = "Edward";
        nomes [3] = "Luffy";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
