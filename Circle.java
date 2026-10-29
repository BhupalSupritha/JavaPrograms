class Circle {
    double radius;

    void CalculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    void CalculateCircumference() {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 5;

        c1.CalculateArea();
        c1.CalculateCircumference();
    }
}
