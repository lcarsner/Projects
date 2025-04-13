import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Declarations
         Scanner in = new Scanner(System.in);
         double celsius = 0;
         double fahrenheit;
         String invalid = "";

         // Input Simulation
         System.out.println("Please enter temperature value in celsius");
         if (in.hasNextInt())
         {
             celsius = in.nextInt();
             in.hasNextLine();
         }
         else
         {
             invalid = in.nextLine();
             System.out.println("Run the program again and enter a valid numeric value!");
             System.exit(0);
         }

         fahrenheit = (celsius * 9/5) + 32;
         System.out.println(fahrenheit);

    }
}