//what is method?
//addition=10,20,30,40
//out of the main function or main method
public class FirstMethod {
    static void addition(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("addition"+c);
    }
    public static void main(String[] args) {
        //call the method
        addition();
    }
}
//out of main class memory creates own memory
//does not depend on other 
//it is constant (value cannot chnage)
