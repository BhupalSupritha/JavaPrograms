class Library {
    String title;
    String author;
    double price;

    static int bookCount = 0;

    Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    static void displayCount() {
        System.out.println("Total Number of Books: " + bookCount);
    }

    public static void main(String[] args) {
        Library b1 = new Library("Java Programming", "James", 450);
        Library b2 = new Library("Python Basics", "John", 350);
        Library b3 = new Library("C Programming", "Dennis", 300);

        b1.display();
        b2.display();
        b3.display();

        Library.displayCount();
    }
}
