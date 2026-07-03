public class Array_Reverse {
    public static void main(String[] args) {
      int a[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Reverse array value");        
        for (int i = 4; i >= 0; i--) {
            System.out.println(a[i] + " ");
        }
    }
}