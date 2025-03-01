import java.util.Scanner;
public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();
        
        double inches = heightCm / 2.54;
        int feet = (int) (inches / 12);
        inches %= 12;
        
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}
