abstract class shape {
    abstract void draw();
}

class circle extends shape {
    void draw() {
        System.out.println("drawing circle");
    }
}

class rectangle extends shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

public class abstraction2 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.draw();

        circle c1 = new circle();
        c1.draw();
    }
}