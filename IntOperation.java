import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking inputs for a, b, and c
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        // Performing integer operations
        int result1 = a + b * c;  // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;  // Multiplication (*) happens first, then addition (+)
        int result3 = c + a / b;  // Division (/) happens first, then addition (+)
        int result4 = a % b + c;  // Modulus (%) happens first, then addition (+)

        // Displaying results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
