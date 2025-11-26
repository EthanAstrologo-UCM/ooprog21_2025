public class StringBuilderDemo {

    public static void main(String[] args) {
        
        
        StringBuilder nameString = new StringBuilder("Ethan");
        
        StringBuilder addressString = new StringBuilder("2443 Providence Street Capitol Site");

        System.out.println("-----jGRASP exec: java StringBuilderDemo-----");
        
        System.out.println("(StringBuilder 1) nameString: " + nameString);
        System.out.println("Capacity of nameString is: " + nameString.capacity()); 
        
        System.out.println("(StringBuilder 2) addressString: " + addressString);
        System.out.println("Capacity of addressString is: " + addressString.capacity());
        

        final int NEW_LENGTH = 20;

        nameString.setLength(NEW_LENGTH);
         
        System.out.println("(Lenght set to 20 for StringBuilder 1) The name is Ethan  end");

        addressString.setLength(NEW_LENGTH);
        
        System.out.println("(Lenght set to 20 for StringBuilder 2) The address is " + addressString);
        
        System.out.println("-----jGRASP: Operation complete.-----");
    }
}