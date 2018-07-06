import java.util.*;
public class EdXProjectOne {
    public static void main (String[] args){
        Bienvenida();
    }
    public static void Bienvenida(){
        Scanner input = new Scanner (System.in);
        System.out.println("Lets play a game called \"Odds and Evens\"");
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Hi "+ name + ", which do you choose (O)Odds or (E)Evens");
        String choose = input.next();
        if (choose.equals("O") || choose.equals("o")){
            System.out.println( name + " has picked Odds! The computer will be evens.");
            System.out.println("----------------------------------------------------");
            System.out.println();
        }
        else {
            System.out.println( name + " has picked Evens! The computer will be odds.");
            System.out.println("----------------------------------------------------");
            System.out.println();
        }
        System.out.println("How many \"fingers\" do you put out?");
        int fingers = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\".");
        System.out.println("----------------------------------------------------");
        System.out.println();
        int sum = fingers + computer;
        boolean oddOrEven = sum % 2 == 0;
        System.out.println( fingers +" + " + computer + " = " + sum );
        if (oddOrEven){
            System.out.println( sum + " is .... Even!");
            if (choose.equals("E") || choose.equals("e")){
                System.out.println("That means " + name + " wins! :)");
            }
            else {
                System.out.println("That means computer wins! :)");
            }
        }
        else {
            if (choose.equals("O") || choose.equals("o")) {
                System.out.println("That means " + name + " wins! :)");
            }
            else {
                System.out.println("That means computer wins! :)");
            }
        }
        System.out.println("----------------------------------------------------");
    }
}