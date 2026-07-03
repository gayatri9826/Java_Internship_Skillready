public class smallest_number {
    public static void main(String[] args) {
        int a[] = {45, 12, 89, 34, 67};
        int smallestElement = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallestElement) {
                smallestElement = a[i];
            }
        }
        System.out.println("smallest element: " + smallestElement);
    }
} 
    
