//hybrid inheritance is a combination of two or more inheritance type
//if we want to use it it uses interface ==> class
//if you have to use interfaces then the method body{} are not allowed to use
interface A {
    void print();
}

interface B {
    void print_B();
}

class C implements A, B {
    public void print() {
        System.out.println("print method");
    }

    public void print_B() {
        System.out.println("print B class method");
    }
}

public class hybrid_inheritance {
    public static void main(String[] args) {
        C object = new C();
        object.print();
        object.print_B();
    }
}
