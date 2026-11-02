class Person {
    private String name;
    private int age;

    static int count = 0;
    static final String COLLEGE = "ABC College";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
    }

    void displayDetails(String label) {
        System.out.println(label + ": " + name);
    }

    static class Department {
        String departmentName;

        Department(String departmentName) {
            this.departmentName = departmentName;
        }

        void display() {
            System.out.println("Department: " + departmentName);
        }
    }
}

class Student extends Person {
    int usn;
    String course;

    Student(String name, int age, int usn, String course) {
        super(name, age);
        this.usn = usn;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Student: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("USN: " + usn);
        System.out.println("Course: " + course);
    }
}

class Faculty extends Person {
    String subject;

    Faculty(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayDetails() {
        System.out.println("Faculty: " + getName());
        System.out.println("Subject: " + subject);
    }
}

class Administrator extends Person {
    String role;

    Administrator(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    void displayDetails() {
        System.out.println("Administrator: " + getName());
        System.out.println("Role: " + role);
    }
}

public class CollegeManagementDemo {
    public static void main(String[] args) {

        Person[] people = {
                new Student("Sufiyan", 20, 153, "CSE"),
                new Faculty("Supritha", 30, "Java"),
                new Administrator("Suchitha", 35, "Office")
        };

        System.out.println(Person.COLLEGE);

        for (Person p : people) {
            p.displayDetails();
            System.out.println();
        }

        Person.Department d =
                new Person.Department("Cyber Security");

        d.display();

        people[0].displayDetails("Student Information");

        System.out.println("Total People: " + Person.count);
    }
}
