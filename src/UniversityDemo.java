class University {
    String universityName;

    University(String universityName) {
        this.universityName = universityName;
    }

    void displayUniversity() {
        System.out.println("University: " + universityName);
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

    class Faculty {
        String facultyName, designation;

        Faculty(String facultyName, String designation) {
            this.facultyName = facultyName;
            this.designation = designation;
        }

        void display() {
            System.out.println("Faculty: " + facultyName);
            System.out.println("Designation: " + designation);
        }
    }
}

public class UniversityDemo {
    public static void main(String[] args) {

        University.Department d =
                new University.Department("Computer Science");

        University u = new University("VTU");

        University.Faculty f =
                u.new Faculty("MahaLaxmi", "Professor");

        u.displayUniversity();
        d.display();
        f.display();
    }
}