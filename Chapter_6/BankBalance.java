import java.util.Scanner;
import java.util.InputMismatchException;

public class BankBalance {

    private static final double INTEREST_RATE = 0.03;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        int year = 0;
        int choice = 1;

        System.out.println("-----jGRASP exec: java BankBalance-----");
        
        try {
            System.out.print("Enter initial bank balance > ");
            balance = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please run the program again and enter a valid number for the balance.");
            scanner.close();
            return;
        }

        while (choice == 1) {
            year++;
            
            balance = balance + (balance * INTEREST_RATE);
            
            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f\n", 
                              year, INTEREST_RATE, balance);
            
            System.out.print("\nDo you want to see the balance at the end of another year?\nEnter 1 for yes or any other number for no >> ");
            
            try {
                String input = scanner.nextLine().trim();
                
                if (input.equals("1")) {
                    choice = 1;
                } else {
                    choice = 0;
                }

            } catch (Exception e) {
                choice = 0;
            }
        }
        
        System.out.println("-----jGRASP: Operation complete.-----");
        scanner.close();
    }
}