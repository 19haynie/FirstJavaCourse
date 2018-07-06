// dont forget to add what type of data you are using (int, double, string)
// review some of the math in this code
import java.util.Scanner;
public class PracticeModule1 {
    public static void main (String [] args) {
        Greeting();
        TimeBudget();
        TimeDifference();
        Area();

    }

    public static void Greeting() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWelcome to Vacation Planner!\nWhat is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you traveling to? ");
        String destination = input.nextLine();
        System.out.println("Great! " + destination + " sounds like a fun trip!");
        System.out.println("**********\n");
    }

    public static void TimeBudget() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Days are you going to spend traveling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend for your trip? ");
        double money = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currencySymbol = input.next();
        System.out.print("How many " + currencySymbol + " are there in 1 USD? ");
        double conversion = input.nextDouble();

        System.out.println("\nIf you are travelling for " + days + " days, that is the same as " + (days * 24) +
                " hours or " + (days * 24 * 60) + " minutes.");
        System.out.println("If you are going to spend $" + (int)money +
                " USD, that means each day you can spend up to $" + ( Math.round( money / days*100) / 100.0) + " USD");
        double conversion2 = ( (money * conversion *100)/100.0 );
        System.out.println("Your total budget in " + currencySymbol + " is " + conversion2 + " " + currencySymbol
                + ", which per day is " + ( Math.round((conversion2 / days) *100) / 100.0) + " " + currencySymbol);
        System.out.println("**********\n");
    }

    public static void TimeDifference() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between home and your destination?");
        int difference = input.nextInt();
        System.out.print("That means when it is midnight at home it will be " + (24 + difference)%24 + ":00 in your travel destination\n" +
                "and when it is noon (12:00) at home it will be " +(12 + difference)%24 + ":00\n");
        System.out.println("**********\n");
    }

    public static void Area() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km squared? ");
        int areakm = input.nextInt();
        System.out.print("In miles squared that is " + (areakm * 0.3861) + "\n");
        System.out.println("**********\n");
    }

}