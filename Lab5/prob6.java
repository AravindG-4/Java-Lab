final class Circle {

    final double PI = 3.14;

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public final double getArea() {
        return PI * radius * radius;
    }

    public final double getPerimeter() {
        return 2 * PI * radius;
    }
}

public class prob6 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.printf("Perimeter of Circle: %.2f" , circle.getPerimeter());
    }
}