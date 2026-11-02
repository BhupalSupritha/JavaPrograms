class Students{
    int rollNo;
    String name;
    int marks;

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {

        Students s1 = new Students();
        Students s2 = new Students();

        s1.rollNo = 153;
        s1.name = "Sufiyan";
        s1.marks = 100;

        s2.rollNo = 10;
        s2.name = "Supritha";
        s2.marks = 90;

        s1.display();
        s2.display();
    }
}