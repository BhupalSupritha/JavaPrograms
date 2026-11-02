class ShapeProgram {
    double area() {
        return 0;
    }
}

class ShapeCircle extends ShapeProgram {
    double radius;

    ShapeCircle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class ShapeRectangle extends ShapeProgram {
    double length, width;

    ShapeRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class ShapeTriangle extends ShapeProgram {
    double base, height;

    ShapeTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        ShapeProgram[] shapes = {
                new ShapeCircle(6),
                new ShapeRectangle(9, 5),
                new ShapeTriangle(10, 5)
        };

        for (ShapeProgram s : shapes) {
            System.out.println("Area: " + s.area());
        }
    }
}