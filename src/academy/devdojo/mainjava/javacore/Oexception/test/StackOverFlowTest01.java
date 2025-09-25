package academy.devdojo.mainjava.javacore.Oexception.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();
    }
//stack over flow error
    public static void recursividade(){
        recursividade();
    }
}
