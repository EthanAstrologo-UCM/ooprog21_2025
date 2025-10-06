import java.util.Scanner;
import java.text.DecimalFormat;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0"); 

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble(); 

        System.out.print("What is your regular pay rate? ");
        double inputPayRate = scanner.nextDouble();
        
        
        Employee employee = new Employee(1001, inputPayRate);
        
        double regularPay = employee.calculateRegularPay(hoursWorked);
        double overtimePay = employee.calculateOvertimePay(hoursWorked);

        System.out.println("Regular pay is " + df.format(regularPay));
        System.out.println("Overtime pay is " + df.format(overtimePay));
        
        System.out.println("\n----jGRASP: Operation complete.");

        scanner.close();
    }
}