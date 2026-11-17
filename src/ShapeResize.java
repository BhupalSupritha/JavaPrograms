interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}

public class ShapeResize {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);

        System.out.println("Original Rectangle:");
        r.display();

        r.resizeWidth(20);
        r.resizeHeight(15);

        System.out.println("\nResized Rectangle:");
        r.display();
    }
}