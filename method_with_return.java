public class method_with_return {

    int addition() {
        int a = 50;
        int b = 90;
        return a + b;
    }

    public static void main(String[] args) {

        method_with_return m3 = new method_with_return();

        System.out.println("Addition: " + m3.addition());
    }
}
