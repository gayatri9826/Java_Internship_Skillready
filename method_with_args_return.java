public class method_with_args_return {

    int addition(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        method_with_args_return m1 = new method_with_args_return();

        System.out.println("Addition: " + m1.addition(30, 56));
    }
}