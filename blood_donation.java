//blood_donation condition
//weight=>60 or 60+ for male candidates
//weight=>50 or 50+ for female candidates
//age=>18 or 18+
//disease=>no sugar / diabeties
//gender=>male/female

import java.util.Scanner;
public class blood_donation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Gender (Male/Female): ");
        String gender = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Weight (kg): ");
        int weight = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Do you have Diabetes? (Yes/No): ");
        String disease = sc.nextLine();

        if (age >= 18) {

            if (disease.equalsIgnoreCase("No")) {

                if (gender.equalsIgnoreCase("Male") && weight >= 60) {
                    System.out.println("You are eligible for blood donation.");
                }
                else if (gender.equalsIgnoreCase("Female") && weight >= 50) {
                    System.out.println("You are eligible for blood donation.");
                }
                else {
                    System.out.println("You are not eligible due to insufficient weight.");
                }

            } else {
                System.out.println("You are not eligible due to diabetes.");
            }

        } else {
            System.out.println("You are not eligible because age is below 18.");
        }

        sc.close();
    }
}