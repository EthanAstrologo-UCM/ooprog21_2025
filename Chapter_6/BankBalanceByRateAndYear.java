import java.util.Scanner;
import java.util.InputMismatchException;

public class BankBalanceByRateAndYear {

    private static final double[] INTEREST_RATES = {0.02, 0.03, 0.04, 0.05};
    private static final int MAX_YEARS = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialBalance = 0.0;

        System.out.println("-----jGRASP exec: java BankBalanceByRateAndYear-----");

        try {
            System.out.print("Enter initial bank balance > ");
            initialBalance = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please run the program again and enter a valid number for the balance.");
            scanner.close();
            return;
        }

        for (double rate : INTEREST_RATES) {
            
            double currentBalance = initialBalance;
            
            System.out.printf("\nWith an initial balance of $%.1f at an interest rate of %.2f\n", 
                              initialBalance, rate);

            for (int year = 1; year <= MAX_YEARS; year++) {
                
                double interest = currentBalance * rate;
                
                currentBalance = currentBalance + interest;
                
                System.out.printf("After year %d balance is $%.4f\n", year, currentBalance);
            }
        }

        System.out.println("\n-----jGRASP: Operation complete.-----");
        scanner.close();
    }
}