import java.util.Scanner;

public class CompareStrings {

    private static final String PREDEFINED_NAME = "Carmen";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("-----jGRASP exec: java CompareStrings-----");
        
        System.out.print("Enter your name > ");
        userInput = scanner.nextLine();
        
        if (userInput.equals(PREDEFINED_NAME)) {
            System.out.println(PREDEFINED_NAME + " equals " + userInput);
        } else {
            System.out.println(PREDEFINED_NAME + " does not equal " + userInput);
        }
        
        System.out.println("-----jGRASP: Operation complete.-----");
        scanner.close();
    }
}