interface vehicle {
    void start();
}

class car implements vehicle {
    public void start() {
        System.out.println("car starts");
    }
}

public class interface_with_abstraction {
    public static void main(String[] args) {
        vehicle v1 = new car();
        v1.start();
    }
}
