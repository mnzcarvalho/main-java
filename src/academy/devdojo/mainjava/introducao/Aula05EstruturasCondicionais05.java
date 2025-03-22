package academy.devdojo.mainjava.introducao;

//Imprimir o dia da semana
public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //char, int, byte, short, enum, String
        int diaSemana = 5;
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
