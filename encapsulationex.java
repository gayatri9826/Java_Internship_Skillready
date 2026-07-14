//encapsulation means the process of binding the data and methods into a single unit(class) while protecting the data from direct access by user 
//ex:-imagine ATM 
//you can withdraw money, deposite , check balance but you cannot directly access or modify 
//bank databases[username,DOB,address,mob no]
//customer==>atm machine==>bank database
//without encapsulation
class student {
    String name;
    int age;
}

public class encapsulationex {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Gayatri Malthane";
        s1.age = 20;
        System.out.println("name=" + s1.name);
        System.out.println("age=" + s1.age);
    }
}
