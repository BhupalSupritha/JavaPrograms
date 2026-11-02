class ManagerPerson {
    String name;
    int age;

    ManagerPerson(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class ManagerEmployee extends ManagerPerson {
    int employeeId;
    double basicSalary;

    ManagerEmployee(String name, int age, int employeeId,
                    double basicSalary) {

        super(name, age);

        this.employeeId = employeeId;
        this.basicSalary = basicSalary;

        System.out.println("Employee constructor");
    }

    void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends ManagerEmployee {
    String department;
    double bonus;

    Manager(String name, int age, int id, double salary,
            String department, double bonus) {

        super(name, age, id, salary);

        this.department = department;
        this.bonus = bonus;

        System.out.println("Manager constructor");
    }

    double totalSalary() {
        return basicSalary + bonus;
    }

    void display() {
        super.display();

        System.out.println("Department: " + department);
        System.out.println("Total Salary: " + totalSalary());
    }
}

public class ManagerDemo {
    public static void main(String[] args) {

        Manager m = new Manager(
                "Supritha", 20, 10, 90000,
                "IT", 10000
        );

        m.display();
    }
}