
public class Main {
    public static void main(String[] args) {

        // Declarations
        double birthMonth = 0;

        // Prompt and Simulate entry
        System.out.println("Enter your birth month in numerical value: ");
        System.out.println("15");
        birthMonth = 15;

        if (birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is" + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value");
        }


    }
}