//what is ternary operator of conditional operator?
//ternary operator is the short form of if-else statement
//if(condition){}
//else{}
//syntax of ternary operator
//condition? value 1: value 2
//condition? true_value:false_value
public class ternaryOP {
    public static void main(String[] args) {
        int marks=80;
        String result=(marks>=40)?"PASS":"FAIL";
        System.out.println("student is:"+result);
    }
}
//if the condition is true then the expression will executes
//otherwise expression 2 executes