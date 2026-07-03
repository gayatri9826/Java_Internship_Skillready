// Print the 2D array and find the addition of all elements
class Addition2D {
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}        };
        int addition= 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                addition = addition + a[i][j];
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Addition : " + addition);
    }
}