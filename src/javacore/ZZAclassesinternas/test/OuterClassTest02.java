package javacore.ZZAclassesinternas.test;

public class OuterClassTest02 {

    private String name = "Midoriya";

    void print() {
        //Uma variável dentro de um metodo é considara efetivamente FINAL
        String lastName = "Izuku";
        class LocalClass {
            public void printLocal(final String param) {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        //precisa instanciar diretamente no metodo
        new LocalClass().printLocal("xD");


    }

    public static void main(String[] args) {
        OuterClassTest02 outer = new OuterClassTest02();
        outer.print();
        System.out.println("Nome: " + outer.name);
    }
}
