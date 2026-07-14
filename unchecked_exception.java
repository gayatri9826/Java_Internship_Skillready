
public class unchecked_exception {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println("length of str=" + str.length());
        } catch (Exception e) {
            System.out.println("string value is null declared");
        }
    }
}
