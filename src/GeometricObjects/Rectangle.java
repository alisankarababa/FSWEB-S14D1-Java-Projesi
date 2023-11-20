package GeometricObjects;

public class Rectangle {

    private double width;
    private double length;

    public double correctedDimension(double dimension) {
        return dimension < 0 ? 0 : dimension;
    }

    public Rectangle(double width, double length) {
        this.width = correctedDimension(width);
        this.length = correctedDimension(length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return length * width;
    }
}
