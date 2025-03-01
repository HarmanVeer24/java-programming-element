import java.util.Scanner;
public class SquareSideCalculator {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculate the side length of the square
        double side = perimeter / 4;

        // Display the result
		System.out.println("The length of the side is " + side + " and the perimeter is " + perimeter + ".");

    }
}