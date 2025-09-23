public class Main {
    public static void main(String[] args) {
        DebugCircle myCircle = new DebugCircle(5.0);

        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Diameter: " + myCircle.getDiameter());
        System.out.println("Area: " + myCircle.getArea());
    }
}