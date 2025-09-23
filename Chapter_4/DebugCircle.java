public class DebugCircle {

    private double radius;
    private double diameter;
    private final double PI = 3.14159;
    private double area;

    public DebugCircle(double r) {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
}
