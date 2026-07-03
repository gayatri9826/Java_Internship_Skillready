public class MaxMin2D_array {
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int minvalue = 100;
        int maxvalue = 0;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(a[i][j] < minvalue) {
                    minvalue = a[i][j];
                }

                if(a[i][j] > maxvalue) {
                    maxvalue = a[i][j];
                }
            }
        }

        System.out.println("Maximum value : " + maxvalue);
        System.out.println("Minimum value : " + minvalue);
    }
}