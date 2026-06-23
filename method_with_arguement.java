public class method_with_arguement {

    void addition(int a, int b) {
        int c = a + b;
        System.out.println("Addition = " + c);
    }

    public static void main(String[] args) {

        method_with_arguement m2 = new method_with_arguement();

        m2.addition(10, 20);
    }
}