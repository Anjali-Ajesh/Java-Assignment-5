public class Rectangle implements Shapes {
    private double length, width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea method for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implementation of calculatePerimeter method for Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
