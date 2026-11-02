class Time {
    int seconds;

    Time(int s) {
        seconds = s;
    }

    Time(int m, int s) {
        seconds = m * 60 + s;
    }

    Time(int h, int m, int s) {
        seconds = h * 3600 + m * 60 + s;
    }

    void display() {
        System.out.println("Time in seconds: " + seconds);
    }

    public static void main(String[] args) {
        Time t1 = new Time(30);
        Time t2 = new Time(2, 30);
        Time t3 = new Time(1, 2, 30);

        t1.display();
        t2.display();
        t3.display();
    }
}
