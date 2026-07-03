//continue :- used to skip the current iteration and move to the next line of code
public class Continue {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==6){
                continue;
            }
            System.out.println(i);
        }
    }
}
