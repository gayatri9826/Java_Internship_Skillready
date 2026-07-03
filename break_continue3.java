public class break_continue3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                continue;
            }
            if (i == 15) {
                break;
            }
            System.out.println("Even  number: " + i);
        }
    }
}
