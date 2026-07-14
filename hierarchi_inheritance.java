class AnimalHI {

    void eat() {
        System.out.println("Animal is Eating");
    }
}

class DogHI extends AnimalHI {

    void bark() {
        System.out.println("Dog is Barking");
    }
}

class CatHI extends AnimalHI {

    void meow() {
        System.out.println("Cat is Meowing");
    }
}

public class hierarchi_inheritance {

    public static void main(String[] args) {

        DogHI d = new DogHI();
        d.eat();
        d.bark();

        System.out.println();

        CatHI c = new CatHI();
        c.eat();
        c.meow();
    }
}