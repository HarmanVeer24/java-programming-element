public class CourseFeeCalculator {
    public static void main(String[] args) {
        // Define course fee and discount percentage
        double fee = 125000;
        double discountPercent = 10;
        
        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;
        
        // Calculate final discounted fee
        double finalFee = fee - discount;
        
        // Display the discount and final fee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
