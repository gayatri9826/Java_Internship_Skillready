class Car {

    // Default Constructor
    Car() {
        System.out.println("Car Created");
    }

    // Parameterized Constructor
    Car(String name) {
        System.out.println("Car Name : " + name);
    }
}

public class constructor_overloading {

    public static void main(String[] args) {

        Car c1 = new Car();

        Car c2 = new Car("BMW");
    }
}