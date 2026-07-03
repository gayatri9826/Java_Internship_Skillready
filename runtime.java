
import java.util.Scanner;

public class runtime {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the value for array : ");
        for(int i=0;i<3;i++){
            for(int j=0;i<3;i++){
                a[i][j]=s1.nextInt();
            }
        }
        System.out.println("your array values are : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(a[i][j]+" ");
            }
        }
    }
}
