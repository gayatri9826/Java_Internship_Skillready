public class count_evennum {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int add = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("Even number: " + a[i]);
                add++;
            }
        }
        System.out.println("Total Count: " + add);
    }
}

