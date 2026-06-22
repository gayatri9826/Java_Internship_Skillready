public class RelationalAssignmentOP {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Relational Operators
        System.out.println("Relational Operators");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Assignment Operators
        System.out.println("\nAssignment Operators");

        int c = 10;

        c += 5;
        System.out.println("c += 5 : " + c);

        c -= 3;
        System.out.println("c -= 3 : " + c);

        c *= 2;
        System.out.println("c *= 2 : " + c);

        c /= 4;
        System.out.println("c /= 4 : " + c);

        c %= 2;
        System.out.println("c %= 2 : " + c);
    }
}