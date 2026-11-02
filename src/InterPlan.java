class InternetPlan {
    String planName;
    int validity;
    double price;

    InternetPlan() {
        this("Basic", 30, 199);
    }

    InternetPlan(String planName, int validity) {
        this(planName, validity, 299);
    }

    InternetPlan(String planName, int validity, double price) {
        this.planName = planName;
        this.validity = validity;
        this.price = price;
    }

    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Validity: " + validity + " days");
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        InternetPlan p1 = new InternetPlan();
        InternetPlan p2 = new InternetPlan("Standard", 56);
        InternetPlan p3 = new InternetPlan("Premium", 84, 499);

        p1.display();
        p2.display();
        p3.display();
    }
}
