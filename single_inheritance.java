// Inheritance is an OOP concept.
// It allows one class to inherit the properties and methods of another class.
// The 'extends' keyword is used for inheritance.
// Syntax:
// class Child extends Parent
// Parent Class:
// The class whose properties and methods are inherited.
// Child Class:
// The class that inherits the properties and methods of the parent class.
// SINGLE INHERITANCE
// Single Inheritance means one parent class and one child class.
// Code Reusability
// Reduces Code Duplication
// Easy Maintenance
// Improves Readability
// Supports Method Overriding
// TYPES OF INHERITANCE
// 1. Single Inheritance
// 2. Multilevel Inheritance
// 3. Hierarchical Inheritance
// 4. Multiple Inheritance (Not supported using classes)
// 5. Hybrid Inheritance (Not supported using classes)
// Java supports Multiple and Hybrid Inheritance
// through Interfaces only.

class Animal {
    void eat() {
        System.out.println("animals are eating");
    }
}

class dog extends Animal {
    void bark() {
        System.out.println("dog is barking");
    }
}

class single_inheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.eat();
    }
}
