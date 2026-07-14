//polymorphism means different behaviours in different situation but person is same
//the word polymorphism means many forms
//it allows one interface or method to perform different actions depending the object
//types of polymorphism
//1.compile time polymorphism
//it is also called method overloding
//2.Runtime polymorphism
//it is also called method overriding
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class compiletime_polymorphism {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("Integer Addition: " + obj.add(10, 20));
        System.out.println("Double Addition: " + obj.add(10.5, 20.5));
    }
}