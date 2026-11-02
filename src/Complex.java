public class Complex {

    int real, imaginary;

    Complex(int r, int i) {
        real = r;
        imaginary = i;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real,
                imaginary + c.imaginary);
    }

    Complex multiply(Complex c) {
        return new Complex(
                real * c.real - imaginary * c.imaginary,
                real * c.imaginary + imaginary * c.real
        );
    }

    void compareMagnitude(Complex c) {
        double m1 = Math.sqrt(real * real + imaginary * imaginary);
        double m2 = Math.sqrt(c.real * c.real + c.imaginary * c.imaginary);

        if (m1 > m2)
            System.out.println("First is greater");
        else if (m1 < m2)
            System.out.println("Second is greater");
        else
            System.out.println("Both are equal");
    }

    Complex copy() {
        return new Complex(real, imaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {

        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(2, 1);

        Complex sum = c1.add(c2);
        Complex product = c1.multiply(c2);
        Complex copy = c1.copy();

        System.out.print("Addition: ");
        sum.display();

        System.out.print("Multiplication: ");
        product.display();

        c1.compareMagnitude(c2);

        c1.real = 10;

        System.out.print("Original: ");
        c1.display();

        System.out.print("Copied: ");
        copy.display();
    }
}
