
class Student {
    String name = "Gayatri";

    void display() {
        int age = 20;
        System.out.println(name);
        System.out.println(age);
    }
}

public class instance_local_variable {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}