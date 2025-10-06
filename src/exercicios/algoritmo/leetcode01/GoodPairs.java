package exercicios.algoritmo.leetcode01;

//Given a array of integer 'nums', return the number of good pairs
//a pair (i, j) is called good if nums[i] == nums[j] and i < j

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};

        int cont = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    System.out.println("(" + i + ", " + j + ")");
                    cont++;
                }
            }
        }
        System.out.println(cont);
    }
}
