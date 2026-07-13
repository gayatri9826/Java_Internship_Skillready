class Maths {
    // Static Method
    static void cube(int num) {
        System.out.println("Cube = " + (num * num * num));
    }
}

public class static_keyword {
    public static void main(String[] args) {
        // Static method is called using class name
        Maths.cube(4);
    }
}