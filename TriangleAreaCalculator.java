import java.util.Scanner;
public class TriangleAreaCalculator {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for base and height
        double baseInCm = sc.nextDouble();
        double heightInCm = sc.nextDouble();

        // Calculate the area of the triangle in square centimeters
        double areaInCm2 = 0.5 * baseInCm * heightInCm;

        // Convert the area to square inches (1 cm² = 0.155 square inches)
        double areaInInches2 = areaInCm2 * 0.155;

        // Convert height to feet and inches
        double heightInInches = heightInCm / 2.54; // 1 inch = 2.54 cm
        int heightInFeet = (int) (heightInInches / 12); // 1 foot = 12 inches
        double remainingInches = heightInInches % 12;

        // Display the results
        System.out.printf("The area of the triangle in square cm"+ areaInCm2 + "and square inches is"+areaInInches2+".");
        System.out.printf("Your Height in cm"+heightInCm+ "in feet is"+heightInFeet+ "and inches is"+remainingInches+".");
    }
}