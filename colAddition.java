public class colAddition {
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} };
       for(int i = 0; i < 3; i++) {
            int colAddition = 0;   // Reset for each row
            for(int j = 0; j < 3; j++) {
                colAddition = colAddition + a[j][i];
            }

            System.out.println("Column " + i + " addition = " + colAddition);
        }
    }
}

