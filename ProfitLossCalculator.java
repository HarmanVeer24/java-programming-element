public class ProfitLossCalculator {
    public static void main(String[] args) {
        // Define cost price and selling price
        double costPrice = 129;
        double sellingPrice = 191;
        
        // Calculate profit
        double profit = sellingPrice - costPrice;
        
        // Calculate profit percentage
        double profitPercentage = (profit / costPrice) * 100;
        
        // Display profit and profit percentage using a single print statement
        System.out.println("Cost Price: INR " + costPrice + "\n" +
                           "Selling Price: INR " + sellingPrice + "\n" +
                           "Profit: INR " + profit + "\n" +
                           "Profit Percentage: " + profitPercentage + "%");
    }
}
