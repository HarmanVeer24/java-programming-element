import java.util.Scanner;
public class HandshakeCalculator {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new sc(System.in);

        // Prompt user for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate maximum number of handshakes using combination formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.printf("The maximum number of handshakes possible among"+numberOfStudents+ "students is"+maxHandshakes+".");
    }
}
