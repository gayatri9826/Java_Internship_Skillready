public class break_continue_keyword {
    public static void main(String[] args) {
      for (int i = 1; i < 10; i++) {
               if (i == 3) {
                System.out.println("Skipping " + i);
                continue;
            }
                if (i == 8) {
                System.out.println("Loop Stopped at " + i);
                break;
            }

            System.out.println(i);
        }
    }
}
