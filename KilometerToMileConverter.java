import java.util.Scanner;
public class KilometerToMileConverter {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        
        // Conversion factor from km to miles
        double miles = km / 1.6;
        
        // Display the converted distance
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}