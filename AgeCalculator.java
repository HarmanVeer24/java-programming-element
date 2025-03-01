public class AgeCalculator {
    public static void main(String[] args) {
        // Define constant values for birth year and current year
        final int BIRTH_YEAR = 2000;
        final int CURRENT_YEAR = 2024;
        
        // Calculate the age
        int age = CURRENT_YEAR - BIRTH_YEAR;
        
        // Display the result
        System.out.println("Harry's age in 2024 is " + age);
    }
}
