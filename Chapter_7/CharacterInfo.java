public class CharacterInfo {

    public static void main(String[] args) {
        
        char c = 'C'; 
        char aChar = 'a'; 

        System.out.println("-----jGRASP exec: java CharacterInfo-----");
        
        System.out.println("The character is " + c);

        if (Character.isUpperCase(c)) {
            System.out.println(c + " is uppercase");
        } else {
            System.out.println(c + " is not uppercase");
        }

        if (Character.isLowerCase(c)) {
            System.out.println(c + " is lowercase");
        } else {
            System.out.println(c + " is not lowercase");
        }
         
        
        char lowerCaseChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + lowerCaseChar);
        
        char upperCaseChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + upperCaseChar);
        
        if (Character.isLetterOrDigit(c)) {
            System.out.println(c + " is a letter or digit");
        } else {
            System.out.println(c + " is not a letter or digit");
        }
        
        if (Character.isWhitespace(c)) {
            System.out.println(c + " is whitespace");
        } else {
            System.out.println(c + " is not whitespace");
        }
        
        System.out.println("-----jGRASP: Operation complete.-----");
    }
}