import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking inputs for a, b, and c as double values
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();

        // Performing operations with double values
        double result1 = a + b * c;  // Multiplication (*) happens first, then addition (+)
        double result2 = a * b + c;  // Multiplication (*) happens first, then addition (+)
        double result3 = c + a / b;  // Division (/) happens first, then addition (+)
        double result4 = a % b + c;  // Modulus (%) happens first, then addition (+)

        // Displaying results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
