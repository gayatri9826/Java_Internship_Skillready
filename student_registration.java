import java.util.Scanner;
public class student_registration {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("******STUDENT REGISTRATION FORM******");
        System.out.println("enter student name:");
        String name=s1.nextLine();
        System.out.println("enter student age:");
        int age=s1.nextInt();
        System.out.println("enter 12th percentage:");
        double percentage=s1.nextDouble();
        System.out.println("enter grade:");
        char grade=s1.next().charAt(0);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Percentage:"+percentage);
        System.out.println("Grade:"+grade);
    }
}
