import java.util.Scanner;

public class JVM {
    public static void main(String[] args) {
        int a = 000321; // Octal number

        Scanner s1 = new Scanner(System.in);
        int b = s1.nextInt();

        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
        System.out.println(a);

        s1.close();
    }
}