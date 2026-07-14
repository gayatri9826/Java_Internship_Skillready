class person {
    String name = "Gayatri";

    void print() {
        System.out.println("Name = " + name);
    }
}

class student extends person {
    int rollno = 1023;

    void print_rollno() {
        System.out.println("RollNo = " + rollno);
    }
}

class single_inheritance1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.print();
        s1.print_rollno();
    }
}
