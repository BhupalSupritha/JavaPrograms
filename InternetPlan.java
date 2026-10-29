class InternetPlan {
    String planName;
    int validity;
    double price;

    InternetPlan() {
        this("Basic", 28, 199);
    }

    InternetPlan(String planName, int validity, double price) {
        this.planName = planName;
        this.validity = validity;
        this.price = price;
    }

    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Validity: " + validity + " days");
        System.out.println("Price: Rs. " + price);
    }

    public static void main(String[] args) {
        InternetPlan p1 = new InternetPlan();
        InternetPlan p2 = new InternetPlan("Premium", 56, 399);

        p1.display();
        System.out.println();
        p2.display();
    }
}
