
class Test {
    int x = 10; // Instance Variable

    void show() {
        int y = 20; // Local Variable
        System.out.println("Instance: " + x);
        System.out.println("Local: " + y);
    }
}

public class instance_variable {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}