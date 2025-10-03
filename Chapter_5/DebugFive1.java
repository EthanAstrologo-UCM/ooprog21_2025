// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
import java.util.Scanner;

public class DebugFive1 {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        final double HIGH_PRICE = 2.59;
        final double MED_PRICE = 1.99;
        final double LOW_PRICE = 0.89;
        int usersChoice;
        double bill = 0.0; // FIX 1: Initialize bill to 0.0

        System.out.println("Order please");
        System.out.print("1 - Burger 2 - Hotdog 3 - Grilled cheese 4 - Fish sandwich >> ");

           if (kb.hasNextInt()) {
            usersChoice = kb.nextInt();
        } else {
            System.out.println("Invalid input for the main order. Exiting.");
            kb.close();
            return;
        }

        if (usersChoice == 1 || usersChoice == 2) {
            bill = bill + HIGH_PRICE;
        } else if (usersChoice == 3 || usersChoice == 4) {
            bill = bill + MED_PRICE;
        } else {
            System.out.println("Invalid menu choice. No main item added to bill.");
        }

        System.out.print("Fries with that? 1 - Yes 2 - No >> ");

        if (kb.hasNextInt()) {
            usersChoice = kb.nextInt();
        } else {
            usersChoice = 2;
        }

        if (usersChoice == 1) {
            bill = bill + LOW_PRICE;
        }

        System.out.println("Total bill is $" + String.format("%.2f", bill)); // Added formatting for currency

        kb.close();
    }
}