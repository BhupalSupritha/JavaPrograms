class StudentData {
    int marks;

    StudentData(int marks) {
        this.marks = marks;
    }
}

public class ArgumentPassingDemo {

    static void change(int x, StudentData s) {
        x = 100;
        s.marks = 95;
        s = new StudentData(50);
    }

    public static void main(String[] args) {
        int n = 20;
        StudentData st = new StudentData(60);

        change(n, st);

        System.out.println(n);
        System.out.println(st.marks);
    }
}
