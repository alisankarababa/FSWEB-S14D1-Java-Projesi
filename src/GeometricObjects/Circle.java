package GeometricObjects;

public class Circle {

    private double radius;

    private double correctedRadius(double radius) {

        return  radius < 0 ? 0 : radius;
    }

    public Circle(double radius) {

        this.radius = correctedRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return  Math.PI * radius * radius;
    }

}
