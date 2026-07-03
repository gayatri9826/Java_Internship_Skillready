public class largest_number {
    public static void main(String[] args) {
        int a[] = {45, 12, 89, 34, 67};
        int largestElement = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largestElement) {
                largestElement = a[i];
            }
        }
        System.out.println("Largest element: " + largestElement);
    }
}