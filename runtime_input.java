//class => class is a keyword
import java.util.Scanner;

public class runtime_input {
    public static void main(String[] args) {
        //how to take runtime input/value from user
        Scanner s1=new Scanner(System.in);
        System.out.println("enter any value:");
        int a=s1.nextInt();
        System.out.println("your value is:"+a);
    }
}
