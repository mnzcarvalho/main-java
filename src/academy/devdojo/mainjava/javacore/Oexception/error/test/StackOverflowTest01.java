package academy.devdojo.mainjava.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }
//stack over flow error
    public static void recursividade(){
        recursividade();
    }
}
