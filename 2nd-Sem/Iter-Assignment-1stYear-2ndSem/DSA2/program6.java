
abstract class Shape {
    abstract double area();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }
}
public class program6 {

	public static void main(String[] args) {
		Square square = new Square(5.0);
        System.out.println("Area of square: " + square.area());

        Triangle triangle = new Triangle(3.0, 4.0);
        System.out.println("Area of triangle: " + triangle.area());

        Circle circle = new Circle(2.5);
        System.out.println("Area of circle: " + circle.area());
		// TODO Auto-generated method stub

	}

}
