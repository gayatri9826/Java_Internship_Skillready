class AnimalML {
    void eat() {
        System.out.println("Animal is Eating");
    }
}

class MammalML extends AnimalML {
    void walk() {
        System.out.println("Mammal is Walking");
    }
}

class DogML extends MammalML {
    void bark() {
        System.out.println("Dog is Barking");
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        DogML d = new DogML();
        d.eat();
        d.walk();
        d.bark();
    }
}