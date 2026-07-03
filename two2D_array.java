public class two2D_array {
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} };
           int r=3;
           int c=3;
        for (int i = 0; i < r*c; i++) {
            int r1=i/c;
            int c1=i%c;
                System.out.print(a[c1][r1] + " ");
            }
            
    }
}

