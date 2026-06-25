//print the reverse number 12345=>54321
public class reverse_number2 {
    public static void main(String[] args) {
        int number=23456;
        int  reverse_number=0;
        while(number>0){
            int remainder=number%10;
            reverse_number=reverse_number*10+remainder;
            number/=10;
        }
        System.out.println("reverse number="+reverse_number);
    }
}
