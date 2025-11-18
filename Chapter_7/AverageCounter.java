public class AverageCounter {

        public static int countGreaterElements(int[] responseTimes) {
        
        if (responseTimes == null || responseTimes.length < 2) {
            return 0; 
        }

        int count = 0; 
        long sumOfPreviousElements = responseTimes[0];
        int elementsProcessed = 1;

        for (int i = 1; i < responseTimes.length; i++) {
            
            double previousAverage = (double) sumOfPreviousElements / elementsProcessed;

            if (responseTimes[i] > previousAverage) {
                count++;
            }

            sumOfPreviousElements += responseTimes[i];
            elementsProcessed++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] exampleArray = {100, 200, 150, 300};
        
        System.out.println("Input: responseTimes = " + java.util.Arrays.toString(exampleArray));
        
        int result = countGreaterElements(exampleArray);
        
        System.out.println("Output: " + result); 
        System.out.println("\n-----jGRASP: Operation complete.-----");
    }
}