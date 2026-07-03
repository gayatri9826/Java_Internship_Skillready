public class RowAddition {
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} };
       for(int i = 0; i < 3; i++) {
            int RowAddition = 0;   // Reset for each row
            for(int j = 0; j < 3; j++) {
                RowAddition = RowAddition + a[i][j];
            }

            System.out.println("Row " + i + " addition = " + RowAddition);
        }
    }
}