class Employee {
    int employeeId;
    String name;
    double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee {
    double allowance, bonus;

    PermanentEmployee(int id, String name, double salary,
                      double allowance, double bonus) {
        super(id, name, salary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return basicSalary + allowance + bonus;
    }
}

class ContractEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    ContractEmployee(int id, String name, double salary,
                     int hoursWorked, double hourlyRate) {
        super(id, name, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee[] employees = {
                new PermanentEmployee(1, "Sufiyan", 30000, 5000, 3000),
                new ContractEmployee(2, "Supritha", 0, 160, 200)
        };

        for (Employee e : employees) {
            e.display();
            System.out.println();
        }
    }
}
