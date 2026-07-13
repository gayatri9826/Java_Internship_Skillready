// Class declaration
class Employeedetails {

    // Parameterized Constructor
    // It receives values when the object is created.
    Employeedetails(int id, String name) {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
    }
}

// Main class
public class parameterized_constructor {

    public static void main(String[] args) {

        // Passing values to the constructor
        Employeedetails e = new Employeedetails(101, "Rahul");
    }
}