public class AverageMarkCalculator {
    public static void main(String[] args) {
        // Define marks in PCM subjects
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
        
        // Calculate the average percentage
        double averageMark = (mathsMark + physicsMark + chemistryMark) / 3.0;
        
        // Display the average mark
        System.out.println("Sam’s average mark in PCM is " + averageMark);
    }
}
