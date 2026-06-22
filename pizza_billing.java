import java.util.Scanner;
class pizza_billing{

public static void main(String[] args){
Scanner s1= new Scanner(System.in);
System.out.println("-----Welcome to pizza shop-----");
System.out.println("enter customer name:");
String name = s1.nextLine();
System.out.println("Enter number of pizza: ");
int quantity = s1.nextInt();
double priceperpizza= 399;
double total_bill = quantity*priceperpizza;
System.out.println("\n===BIL===");
System.out.println("Customer name:"+name);
System.out.println("Quantity of pizza:"+quantity);
System.out.println("Total_bill"+total_bill);
}
}

