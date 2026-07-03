public class Average_Array {
public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int addition = 0;
         for (int i = 0; i < a.length; i++) {
            addition = addition + a[i];
        }
       System.out.println("Total value of array: " + addition);
        double findAverage = (double) addition / a.length;
        System.out.println("Average: " + findAverage);
    }
} 
    
