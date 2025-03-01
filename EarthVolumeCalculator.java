public class EarthVolumeCalculator {
    public static void main(String[] args) {
        // Define radius of Earth in kilometers
        double radiusKm = 6378;
        
        // Conversion factor from cubic kilometers to cubic miles
        double conversionFactor = 0.621371;
        
        // Calculate volume of Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * 3.14 * radius*radius*radius;
        
        // Convert volume to cubic miles
        double volumeMiles3 = volumeKm3 * conversionFactor*conversionFactor*conversionFactor;
        
        // Display the volume in both units
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}