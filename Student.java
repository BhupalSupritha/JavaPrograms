class Student {
    int usn;
    String name;
    int age;

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.usn = 153;
        s1.name = "Sufiyan";
        s1.age = 20;

        s2.usn = 10;
        s2.name = "Supritha";
        s2.age = 20;

        s1.display();
        s2.display();
    }
}
