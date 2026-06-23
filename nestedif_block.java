public class nestedif_block {

    public static void main(String[] args) {

        int a = 30;
        int b = 50;
        int c = 90;

        if (a == 10) {

            if (b == 20) {

                if (c == 30) {
                    System.out.println("All conditions are true");
                } else {
                    System.out.println("Condition c == 30 is false");
                }

            } else {
                System.out.println("Condition b == 20 is false");
            }

        } else {
            System.out.println("Condition a == 10 is false");
        }
    }
}