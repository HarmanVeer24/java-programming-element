import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking two numbers as input
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display the result
        System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder + 
                           " of two numbers " + number1 + " and " + number2);
    }
}
