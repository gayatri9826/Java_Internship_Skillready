public class AsciiTable {
    public static void main(String[] args) {
        char c='A';
        while(c<='Z'){
            System.out.println(c+"="+(int)c);
            c++;
        }
    }
}
