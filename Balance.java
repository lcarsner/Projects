public class Main {
    public static void main(String[] args) {

        // Declarations
        double balance = 5000;
        double interestRateAmount1 = 0;
        double interestRateAmount2 = 0;
        final double INTEREST_RATE = 0.17;

        // Calculate Interest Rate
        interestRateAmount1 = balance * INTEREST_RATE;
        interestRateAmount2 = interestRateAmount1 + balance * INTEREST_RATE;

        // Output to User
        System.out.println("The interest rate for $" + balance + "at %" + INTEREST_RATE + "is $" + interestRateAmount1);
        System.out.println("The interest due for the 2nd month at %" + INTEREST_RATE + "is $" + interestRateAmount2);

    }
}