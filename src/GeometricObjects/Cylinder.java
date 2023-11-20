package GeometricObjects;

public class Cylinder extends Circle {

    private double height;

    private double correctedHeight(double height) {

        return height < 0 ? 0 : height;
    }

    public Cylinder(double radius, double height) {

        super(radius);
        this.height = correctedHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {

        return height * getArea();
    }

}
