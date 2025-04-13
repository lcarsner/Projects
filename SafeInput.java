import java.util.Scanner;

public class SafeInput {

    public static String getRegExString(Scanner pipe, String prompt, String regExPattern) {
        String value = "";
        boolean gotAValue = false;
        do {
            System.out.print(prompt + ": ");
            value = pipe.nextLine();
            if (value.matches(regExPattern)) {
                gotAValue = true;
            } else {
                System.out.println("\nInvalid input: " + value);
            }
        } while (!gotAValue);
        return value;
    }

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        boolean gotAValue = false;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                gotAValue = true;
            }
            else
            {
                System.out.println("Please enter a valid integer");
            }
            pipe.nextLine();
        }
        while (!gotAValue);
        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0.0;
        boolean gotAValue = false;
        do {
            System.out.println(prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                gotAValue = true;
            }
            else
            {
                System.out.println("Please enter a valid double");
            }
            pipe.nextLine();
        }
        while (!gotAValue);
        return retDouble;
    }

    public static int getRangedInt(Scanner console, String prompt, int low, int high) {
        int result;
        do {
            System.out.print(prompt);
            while (!console.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                console.next();
            }
            result = console.nextInt();
        } while (result < low || result > high);
        return result;
    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double rangedDouble = 0;
        boolean gotAValue = false;
        do {
            System.out.print(prompt + " ( " + low + " - " + high + " ) ");
            if (pipe.hasNextDouble()) {
                rangedDouble = pipe.nextDouble();
            }
            if (rangedDouble >= low && rangedDouble <= high)
            {
                gotAValue = true;
            }
            else
            {
                System.out.print(" The value must be between " + low + " and " + high);
            }
            pipe.nextLine();
        }
        while (!gotAValue);
        return rangedDouble;
    }

    public static boolean getYNConfirm(Scanner console, String prompt) {
        String response;
        System.out.print(prompt + " [Y/N]: ");
        do {
            response = console.next().trim().toLowerCase();
        } while (!response.equals("y") && !response.equals("n"));
        return response.equals("y");
    }
}


