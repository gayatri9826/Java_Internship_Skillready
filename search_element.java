import java.util.Scanner;

public class search_element {
    public static void main(String[] args) {
       int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter search element in an array: ");
        int search_value = s1.nextInt();
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == search_value) {
                j = 1;
                break;
            }
        }
        if (j == 1) {
            System.out.println("Number is available");
        } else {
            System.out.println("Number is unavailable");
        }
    }
}