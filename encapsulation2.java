class Student {
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class encapsulation2 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Gayatri Malthane");
        s1.setAge(20);

        System.out.println("Name = " + s1.getName());
        System.out.println("Age = " + s1.getAge());
    }
}