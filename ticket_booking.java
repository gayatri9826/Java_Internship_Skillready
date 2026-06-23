//train ticket online
//total person
//female =>50% off  male => no discount
//child => 0-5 year =>no ticket price
//coach 1.general => 100 rs
//2.sleeper => 300 rs
//3.3 tier => 1000 rs
//4.2 tier => 2000 rs
//5.1 tier => 3000 rs
//total price calculate =>?
import java.util.Scanner;

public class ticket_booking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Gender (Male/Female): ");
        String gender = sc.nextLine();

        System.out.println("Coach Details:");
        System.out.println("1. General = 100");
        System.out.println("2. Sleeper = 300");
        System.out.println("3. 3 Tier = 1000");
        System.out.println("4. 2 Tier = 2000");
        System.out.println("5. 1 Tier = 3000");

        System.out.print("Enter Coach Number: ");
        int coach = sc.nextInt();

        double price = 0;

        if (coach == 1) {
            price = 100;
        }
        else if (coach == 2) {
            price = 300;
        }
        else if (coach == 3) {
            price = 1000;
        }
        else if (coach == 4) {
            price = 2000;
        }
        else if (coach == 5) {
            price = 3000;
        }
        else {
            System.out.println("Invalid Coach Number");
            return;
        }

        if (age <= 5) {
            price = 0;
        }
        else if (gender.equalsIgnoreCase("Female")) {
            price = price / 2;   // 50% discount
        }

        System.out.println("Total Ticket Price = ₹" + price);

        sc.close();
    }
}
