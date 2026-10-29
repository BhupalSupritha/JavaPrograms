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

    static void displayCount() {
        System.out.println("Total Books: " + bookCount);
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
    }

    public static void main(String[] args) {
        Library b1 = new Library("Java", "James", 300);
        Library b2 = new Library("Python", "Guido", 400);

        b1.display();
        System.out.println();

        b2.display();
        System.out.println();

        Library.displayCount();
    }
}
