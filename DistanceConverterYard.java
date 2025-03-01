import java.util.Scanner;
public class DistanceConverterYard {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Convert feet to yards and miles
        double distanceInYards = distanceInFeet / 3; // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760; // 1 mile = 1760 yards

        // Display the results
         System.out.printf("The distance in yards is"+ distanceInYards + "and in miles is"+ distanceInMiles + ".");
    }
}
