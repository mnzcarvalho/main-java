package introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 meses
        // 31, 28, 31, 30, 31
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 0;
        dias[1][1] = 1;
        dias[1][2] = 2;

        dias[2][0] = 11;
        dias[2][1] = 22;
        dias[2][2] = 33;
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("--------------------------------");

        for (int[] arrBrase : dias) {
            for (int num : arrBrase) {
                System.out.println(num);
            }
        }

    }
}
