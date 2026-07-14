import java.io.FileReader;
public class checked_exception {
    public static void main(String[] args) {
        try{
            int num=10/0;
        }
        catch(Exception e){
            System.out.println("can not divide by zero");
        }
    }    
}
