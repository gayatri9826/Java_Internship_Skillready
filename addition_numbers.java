//find the sum of first 10 natural numbers
// 1 2 3 4 5 6 7 8 9 10
public class addition_numbers {
    public static void main(String[] args) {
        int i=1;
        int addition=10;
        while(i<=10){
            addition=addition+i;
            System.out.println(i);
            i++;
        }
        System.out.println("addition : "+addition);
    }
}
