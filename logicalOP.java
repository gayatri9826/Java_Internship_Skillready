public class logicalOP {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Logical AND (&&): True if both conditions are true
        System.out.println("a>b && b>0 = " + (a > b && b > 0));

        // Logical OR (||): True if at least one condition is true
        System.out.println("a<b || b>0 = " + (a < b || b > 0));

        // Logical NOT (!): Reverses the result
        System.out.println("!(a>b) = " + !(a > b));
    }
}