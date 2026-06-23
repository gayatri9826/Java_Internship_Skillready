class Demo {
    static void print() {
        System.out.println("parent");
    }
}

public class StaticMethod extends Demo {

    static void print() {
        System.out.println("child");
    }

    public static void main(String[] args) {

        Demo d1 = new Demo();
        d1.print();          // Output: parent

        StaticMethod s1 = new StaticMethod();
        s1.print();          // Output: child
    }
}
//static method cannot be override
//other than that the static method are always hide