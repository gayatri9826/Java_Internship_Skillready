public class factorial {
    public static void main(String[] args) {
        int number=5;
        int factorial=1;
        while(number>0){
            //factorial=factorial*number
            factorial*=number;
            number--;
        }
        System.out.println("factorial value of 5 : "+factorial);
    }
}
