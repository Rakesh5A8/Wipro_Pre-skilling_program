package Day10;


class Shape {
    public double area() {
        System.out.println("Calculating area for a generic shape...");
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the area() method for a Circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the area() method for a Rectangle
    @Override
    public double area() {
        // Area of Rectangle: $l \times w$
        return length * width;
    }
}

public class shapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Shape genericShape = new Shape();

        System.out.println("Generic Shape Area: " + genericShape.area());
        System.out.println("Circle Area (radius 5.0): " + circle.area());
        System.out.println("Rectangle Area (4.0 x 6.0): " + rectangle.area());
    }
}