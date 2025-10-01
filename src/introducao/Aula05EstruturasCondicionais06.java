package introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        //1 = domingo
      // int[] diaUtil = {2, 3, 4, 5, 6};
      int diaHoje = 1996;
      switch (diaHoje){
          case 1:
              System.out.println("É final de semana, bora dale dinovo?");
              break;
          case 2:
              System.out.println("É dia útil, bora dale?");
              break;
          case 3:
              System.out.println("É dia útil, bora dale?");
              break;
          case 4:
              System.out.println("É dia útil, bora dale?");
              break;
          case 5:
              System.out.println("É dia útil, bora dale?");
              break;
          case 6:
              System.out.println("É dia útil, bora dale?");
              break;
          case 7:
              System.out.println("É final de semana, bora dale dinovo?");
              break;
          default:
              System.out.println("Ooooohhhhh disgraçaaaaa...");
              break;
      }
      /*if (diaHoje != 1 || 7 ){
          System.out.println("É dia útil, bora dale?");
      } else {
          System.out.println("É final de semana, bora dale dinovo?");
      } */
    }
}
