import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declarations
        String Party;
        Scanner myScanner = new Scanner(System.in);


        System.out.println("Please enter your party Affiliation");
        System.out.println("D - Democratic");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        Party = myScanner.nextLine();



        if (Party.equals("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if (Party.equals("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (Party.equals("I"))
        {
            System.out.println("You get an Independent Man");
        }
        else
        {
            System.out.println("You get Other");
        }




        }
    }
