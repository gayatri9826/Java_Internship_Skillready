// Constructor with Inheritance
class Animal {
    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog Constructor");
    }
}

public class constructor_inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println();
        Dog d2 = new Dog();
    }
}