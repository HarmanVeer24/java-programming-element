public class DistanceConverter {
    public static void main(String[] args) {
        // Define the distance in kilometers
        double kilometers = 10.8;
        
        // Conversion factor from km to miles
        double conversionFactor = 1.6;
        
        // Convert kilometers to miles
        double miles = kilometers / conversionFactor;
        
        // Display the converted distance
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}