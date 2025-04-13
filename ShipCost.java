public class Main {
    public static void main(String[] args) {

        // Declarations
        double price = 0;
        final double shippingCost = 0.02;
        double freeShipping = 0;
        double totalPrice = 0;

        // Prompt and Simulate entry
        System.out.println("Enter price of items");
        System.out.println("$80");
        price = 80;

        totalPrice = price + (price * shippingCost);

        if (price < 100) {
            System.out.println("Your total with shipping is $" + totalPrice);
        }
        else

            System.out.println("The total cost with shipping would be $" + price + freeShipping);
        {


        }
    }
}



