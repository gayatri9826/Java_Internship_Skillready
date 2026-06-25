//calculate the power of 2 to the power of 5
    public class power {
    public static void main(String[] args) {
        int result = 1;
        int base = 2;
        int power = 5;
        int i = 1;
        while (i <= power) {
            result = result * base;
            i++;
        }

        System.out.println(result);
    }
}

