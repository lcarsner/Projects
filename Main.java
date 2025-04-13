public class Main {

    public static void main(String[] args) {

        // Declarations
        double purchasePrice = 0;
        double salesTaxAmount = 0;
        final double SALES_TAX_RATE = .05;

        // User Prompt
        System.out.println("Enter the purchase price: ");

        // User Input Simulation
        System.out.println("150");
        purchasePrice = 150;

        // Calculate the Sales Tax Amount
        salesTaxAmount = purchasePrice * SALES_TAX_RATE;

        // Output to User
        System.out.println("The sales tax for the purchase price of $" +
                purchasePrice + " is $" + salesTaxAmount + ".");

    }
}