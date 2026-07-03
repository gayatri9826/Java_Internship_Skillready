import java.util.Scanner;

public class runtime2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = s1.nextInt();
        System.out.println("Enter the number of columns:");
        int col = s1.nextInt();
        int a[][] = new int[rows][col];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < col; j++) {
                a[i][j] = s1.nextInt();
            }
        }
        System.out.println("Your array values are:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }        s1.close();
    }
}