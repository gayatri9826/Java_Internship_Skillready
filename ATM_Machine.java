// Class declaration
public class ATM_Machine {

    // Instance variables
    String bankname;
    int balance;

    // Default Constructor
    public ATM_Machine() {

        // Initializing instance variables
        bankname = "SBI";
        balance = 50000;

        System.out.println("ATM Machine is started");
    }

    // Method to display ATM details
    void printATM() {
        System.out.println("Bank Name : " + bankname);
        System.out.println("Balance : " + balance);
    }

    // Main method
    public static void main(String[] args) {

        // Creating an object
        ATM_Machine atmobj = new ATM_Machine();

        // Calling the method
        atmobj.printATM();
    }
}