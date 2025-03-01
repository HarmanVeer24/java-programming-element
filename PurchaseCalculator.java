import java.util.Scanner;
public class PurchaseCalculator {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new sc(System.in);

        // Prompt user for unit price and quantity
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();

        // Calculate total purchase price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.printf("The total purchase price is"+totalPrice+ "if the quantity is"+quantity+ "and unit price is INR %.2f.%n"+unitPrice+".");
    }
}
