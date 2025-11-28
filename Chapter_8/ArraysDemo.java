import java.util.Arrays;

public class ArraysDemo {

        public static void display(String message, int[] array) {
        System.out.print(message);
        
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[] myArray = new int[5];
        
        System.out.println("-----jGRASP exec: java ArraysDemo-----");
        
        display("Original array:         ", myArray);

        Arrays.fill(myArray, 8);
        display("After filling with 8s:  ", myArray);

        myArray[2] = 6;
        myArray[4] = 3;
        display("After changing two values: ", myArray);

        Arrays.sort(myArray);
        display("After sorting:          ", myArray);
        
        System.out.println("-----jGRASP: Operation complete.-----");
    }
}