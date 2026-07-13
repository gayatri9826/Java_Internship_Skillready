class Circle {
    // Final Variable
    final double PI = 3.14;

    void area(int radius) {

        System.out.println("Area = " + PI * radius * radius);
    }
}

public class final_keyword {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area(5);
    }
}