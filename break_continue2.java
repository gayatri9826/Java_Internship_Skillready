public class break_continue2 {

    public static void main(String[] args) {
        // Loop from 1 to 20
        for (int i = 1; i <= 20; i++) {
                // Skip even numbers
            if (i % 2 == 0) {
                continue;
            }
            // Stop the loop when i becomes 15
            if (i == 15) {
                break;
            }
            // Print odd numbers
            System.out.println("Odd number: " + i);
        }
    }
}