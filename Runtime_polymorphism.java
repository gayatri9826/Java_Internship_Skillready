// Method Overriding (Runtime Polymorphism)

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Runtime_polymorphism {
    public static void main(String[] args) {

        Animal a;

        a = new Dog(); // Parent reference -> Dog object
        a.sound();

        a = new Cat(); // Parent reference -> Cat object
        a.sound();
    }
}