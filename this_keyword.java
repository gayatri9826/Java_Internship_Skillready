class Book {
    int id;

    // Constructor parameter and instance variable have same name
    Book(int id) {
        // this.id refers to instance variable
        this.id = id;
    }

    void display() {

        System.out.println("Book ID : " + id);
    }
}

public class this_keyword {
    public static void main(String[] args) {
        Book b = new Book(500);
        b.display();
    }
}