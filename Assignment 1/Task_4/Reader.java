public class Reader {

    String FULL_NAME;
    int library_card_number;
    String faculty;
    int Date_of_Birth;
    String phone;
    class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
    class Person {
        String FULL_NAME;
        int library_card_number;
        String faculty;
        int Date_of_Birth;
        String phone;

        Person(String FULL_NAME, int library_card_number, String faculty, int Date_of_Birth, String phone) {
            this.FULL_NAME = FULL_NAME;
            this.library_card_number = library_card_number;
            this.faculty = faculty;
            this.Date_of_Birth = Date_of_Birth;
            this.phone = phone;
        }
    }

    // Methods with takeBook
    public void takeBook(int number ) {
        System.out.println(FULL_NAME +" VV took "  +number +" books" );
    }
    public void takeBook(String... title ){
        System.out.print(FULL_NAME + " VV took books " );
        for(String i: title ){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public void takeBook1(Book... books) {
        System.out.print(FULL_NAME +" took books: ");
        for (Book book : books) {
            System.out.print(book.title + " by " + book.author + ", ");
        }
        System.out.println();
    }
    //Methods with returnBook
    public void returnBook(int number ) {
        System.out.println(FULL_NAME + " VV return "  +number +" books" );
    }
    public void returnBook(String... title ) {
        System.out.print(FULL_NAME + " VV return books " );
        for(String i: title ){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        // Creating an array of Person objects
        Person[] new_arr = new Person[2];
        new_arr[0] = new Reader().new Person("John", 25, "Engineering", 19980101, "123456789");
        new_arr[1] = new Reader().new Person("Jane", 30, "Science", 19951231, "987654321");

        // Iterating over the array and printing values
        for (Person person : new_arr) {
            System.out.println("Name: " + person.FULL_NAME + ", Library Card Number: " + person.library_card_number);
        }
        //using methods takeBook
        Reader obj1 = new Reader();
        obj1.FULL_NAME="Almas";
        obj1.takeBook(3);
        obj1.takeBook("Adventures", "Dictionary", "Encyclopedia");
        Reader.Book book1 = obj1.new Book("Title 1 ", "Author1");
        Reader.Book book2 = obj1.new Book("Title 2 ", "Author2");
        obj1.takeBook1(book1,book2);
        //using methods returnBook
        obj1.returnBook(5);
        obj1.returnBook("Janr 1","Janr 2");
    }
}
