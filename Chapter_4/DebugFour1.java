import java.util.Scanner;

public class DebugFour1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int radiusValue;
        
        DebugCircle c = new DebugCircle(); 
        
        System.out.print("Enter a radius for a circle >> ");
        radiusValue = input.nextInt(); 
        
        c.setRadius(radiusValue);
        
        System.out.println("The radius is " + c.getRad());
        System.out.println("The diameter is " + c.getDiam());
        System.out.println("The area is " + c.getArea());
        
        input.close();
  }
}