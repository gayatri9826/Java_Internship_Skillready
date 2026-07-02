//nested do while Joop means
//outer loop and inner loop
//do{
//do{ }  while();
//} while ();
public class nested_dowhile {
    public static void main(String[]args){
    int i=1;
    do{
        int j=1;
        do{
            System.out.println (i+" "+j);
            j++;
        }
        while (j<=3); 
        i++;
    }
    while (i<=3);
}
}
