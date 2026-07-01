package javacore.ZZAclassesinternas.test;

class Animal {
    public void walk(){
        System.out.println("Animal is walking");
    }
}

public class AnonymousClassTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Anonymous animal is walking");
            }
        };
        animal.walk();
    }
}
