//count digits in a number
//123456 --> 6
public class count_number {
    public static void main(String[] args) {
        int i=12585;
        int count=0;
        while(i>0){
            count++;
            i/=10;
        }
        System.out.println(" count number "+count);
    }
}
