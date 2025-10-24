import java.util.Scanner;

public class DebugSix1
{
    public static void main(String args[])
    {
    
        Scanner keyboard = new Scanner(System.in);
        int days;
        double money = 0.01;
        int dayCounter = 1;

        System.out.print("Enter number of days >> ");
        
        days = keyboard.nextInt();
        
        while(dayCounter <= days)
        {
            money = 2 * money;
            
            System.out.println("After day " + dayCounter + " you have $" + money); 
            
            ++dayCounter;
        }
        
        keyboard.close();
    }
}