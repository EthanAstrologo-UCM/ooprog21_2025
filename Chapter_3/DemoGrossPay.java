public class DemoGrossPay {
  
  public static final double HOURLY_RATE = 22.75;
  
  public static void calculateGrossPay (double hoursWorked) {
    double grossPay = hoursWorked * HOURLY_RATE;
    
    System.out.printf("%4.1f hours at $.2f per hour is $%.2f%n", hoursWorked, HOURLY_RATE, grossPay);
  }
  
  public static void main (String[] args) {
    calculateGrossPay(10.0);
    calculateGrossPay(25.0);
    calculateGrossPay(37.5);
  }
}