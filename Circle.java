// Circle class implementing the Shapes interface
public class Circle implements Shapes {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea method for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of calculatePerimeter method for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Triangle class implementing the Shapes interface


// Rectangle class implementing the Shapes interface
