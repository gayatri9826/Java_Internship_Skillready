// Class declaration
class Student1 {

    // Default Constructor
    // It has the same name as the class and has no parameters.
    // It is called automatically when an object is created.
    Student1() {
        System.out.println("Default Constructor Called");
    }
}

public class default_constructor {

    public static void main(String[] args) {

        // Creating an object of Student class
        // As soon as the object is created,
        // the default constructor is called automatically.
        Student1 s = new Student1();

        // No need to call the constructor separately.
        // It is already executed when 'new Student()' is written.
    }
}
