
class Student {
    int id = 101;
    String name = "Gayatri";

    void display() {
        System.out.println(id);
        System.out.println(name);
    }
}

public class studentex {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}