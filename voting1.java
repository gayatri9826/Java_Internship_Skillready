 import java.util.Scanner;

public class voting1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your country: ");
        String country = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (country.equalsIgnoreCase("India")) {

            if (age >= 18) {
                System.out.println("You are eligible for voting.");
            } else {
                System.out.println("You are not eligible for voting.");
            }

        } else {
            System.out.println("You are not an Indian citizen.");
        }

        sc.close();
    }
    
}
