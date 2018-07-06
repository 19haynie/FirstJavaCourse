java.util.Scanner; import java.text.DecimalFormat;

public class HelloWorld {

    public static void main(String[] args) {

        greeting();
        getDestination();
        getBudget();
        getTime();
        getCountryArea();
    }

    /*Greetings & get user's name*/
    private static void greeting(){
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", ");

    }

    /*Get destination info*/
    private static void getDestination(){
        Scanner input = new Scanner (System.in);
        System.out.print("Where are you travelling to? ");
        String place = input.next();
        System.out.println("Great! " + place + " sounds like a great trip!");

    }

    /*Get detail trip info: duration, total budget in EUR and give info of local currency budget */
    private static void getBudget(){
        Scanner input = new Scanner (System.in);
        System.out.print("How many days are you going to spend in your destination? ");
        while(!input.hasNextInt()) { //repeat until a number is entered.
            input.next();
            System.out.println("Enter numbers only"); //Tell it's not a number.
        }
        Integer time = input.nextInt();
        System.out.print("What is your total budget for the trip in EUR? ");
        while(!input.hasNextInt()) { //repeat until a number is entered.
            input.next();
            System.out.println("Enter numbers only"); //Tell it's not a number.
        }
        Integer money = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = input.next();
        System.out.print("How many "+ currency + " are there in 1 EUR? " );
        while(!input.hasNextInt()) { //repeat until a number is entered.
            input.next();
            System.out.println("Enter numbers only"); //Tell it's not a number.
        }
        Integer moneyC = input.nextInt();
        System.out.println("If you are travelling for " + time + " days that is the same as " + (time * 24) + " hours or " + (time*(60*24))+ " minutes");
        System.out.println("If you are going to spend " + money + " EUR that means per day you can spend up to " + (money/time) +" EUR.");
        System.out.println("Your total budget in " + currency + " is " + (money * moneyC) + currency + " ,which per day is " + ((money*moneyC)/time) + currency );
    }

    /*Understand time difference and give info of time difference*/
    private static void getTime(){
        Scanner input = new Scanner (System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? If destination time is behind use - before number ");
        while(!input.hasNextInt()) { //repeat until a number is entered.
            input.next();
            System.out.println("Enter numbers only"); //Tell it's not a number.
        }
        Integer timeDiff = input.nextInt();
        System.out.println("That means that when it is midnight at home it will be " + (timeDiff % 24) +  ":00 in your travel destination and when it is noon at home it will be " + ((12 + timeDiff)%24) + ":00" );

    }

    /*Get country area*/
    private static void getCountryArea(){
        Scanner input = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("What is the square area of your destination country in km2? ");
        Double squareArea = input.nextDouble();
        System.out.print("In miles2 that is " + df.format(squareArea*0.386102159));

    }
} {
}
