public class Triangle implements Shapes {
    private double side1, side2, side3;

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implementation of calculateArea method for Triangle
    @Override
    public double calculateArea() {
        // Heron's formula for calculating the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Implementation of calculatePerimeter method for Triangle
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}