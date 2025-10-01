package introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 10;
        int age1 = (int)10000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0d;
        double salarioFloat = 2500.0;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0040'; //unicode or ASCII table
        String string = "a long text hereee";
        //var java10 = "versionamentos";

        System.out.println(string);
        System.out.println("A idade é: "+ age +" anos");
        System.out.println("casting int > long  "+ age1);
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
    }
}
