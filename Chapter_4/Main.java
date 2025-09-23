public class Main {
    public static void main(String[] args) {
        DebugCircle myCircle = new DebugCircle(5.0);

        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Diameter: " + myCircle.getDiameter());
        System.out.println("Area: " + myCircle.getArea());
    }
}

class DebugCircle {

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