public class Static_Variable {
    static int a=100;
    static {a=a+20;}
    public static void main(String[] args) {
        System.out.println("value of a:"+a);
    }
}
