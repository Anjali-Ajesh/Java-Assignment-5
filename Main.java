import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Circle
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        // Input for Triangle
        System.out.println("Enter the lengths of the sides of the triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);

        // Input for Rectangle
        System.out.println("Enter the length and width of the rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);

        // Calculate and print area and perimeter of each shape
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        // Close the scanner
        scanner.close();
    }
}
