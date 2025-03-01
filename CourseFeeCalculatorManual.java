import java.util.Scanner;
public class CourseFeeCalculatorManual {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the course fee: ");
        double fee = sc.nextDouble();
        
        System.out.print("Enter the discount percentage: ");
        double discountPercent = sc.nextDouble();
        
        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;
        
        // Calculate final discounted fee
        double finalFee = fee - discount;
        
        // Display the discount and final fee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}