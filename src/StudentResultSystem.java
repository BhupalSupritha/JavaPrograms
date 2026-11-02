class StudentRecord {
    private String usn, name;
    private int m1, m2, m3;

    static int count = 0;
    final int MAX_MARKS = 100;

    StudentRecord(String usn, String name,
                  int m1, int m2, int m3) {
        this.usn = usn;
        this.name = name;
        this.m1 = validate(m1);
        this.m2 = validate(m2);
        this.m3 = validate(m3);
        count++;
    }

    private int validate(int mark) {
        if (mark < 0 || mark > MAX_MARKS) {
            throw new IllegalArgumentException(
                    "Invalid marks");
        }
        return mark;
    }

    String getUsn() {
        return usn;
    }

    String getName() {
        return name;
    }

    int total() {
        return m1 + m2 + m3;
    }

    double average() {
        return total() / 3.0;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    void display(boolean result) {
        display();
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total());
        System.out.println("Average: " + average());
    }

    ResultSummary getSummary() {
        return new ResultSummary(total(), average());
    }
}

class ResultSummary {
    int total;
    double average;

    ResultSummary(int total, double average) {
        this.total = total;
        this.average = average;
    }

    void display() {
        System.out.println("Summary Total: " + total);
        System.out.println("Summary Average: " + average);
    }
}

public class StudentResultSystem {
    public static void main(String[] args) {
        StudentRecord s = new StudentRecord(
                "1AJ25CY010", "Supritha", 100, 90, 95);

        s.display();
        s.display(true);
        s.getSummary().display();

        System.out.println("Students: " + StudentRecord.count);
    }
}
