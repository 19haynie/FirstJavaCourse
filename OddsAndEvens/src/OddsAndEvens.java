import java.util.Scanner;
        java.util.Scanner;
import java.util.*;
public class OddsAndEvens {
    public static void main (String[] args) {
        Intro();
    }

    public static void Intro(){
        //Introductory questions
        System.out.println("\nLet's play a game called \"Odds and Evens\"");
        Scanner input = new Scanner (System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String OorE = input.next();
        if (OorE.equals("O") || OorE.equals("o")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        }
            else {
                System.out.println(name + " has picked evens! The computer will be odds.");
            }
        System.out.println("_____________________________________________________\n");


        //Game is being played
        System.out.print("How many \"fingers\" do you put out? ");
        int fingers = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " fingers.");
        System.out.println("_____________________________________________________\n");


        //Results are determined
        int sum = fingers + computer;
        System.out.println(fingers + " + " + computer + " = " + sum);
        boolean OddorEven = sum % 2 == 0;
        if (OddorEven) {
                System.out.println(sum + " is... even!");
                if (OorE.equals("E") || OorE.equals("e")) {
                System.out.println("That means " + name + " wins! :)");
                }
                else {
                System.out.println("That means " + name + " loses :(");
                }
        }
            else {
                System.out.println(sum + " is... odd!");
                    if (OorE.equals("O") || OorE.equals("o")) {
                        System.out.println("That means " + name + " wins! :)");
                    }
                    else {
                        System.out.println("That means " + name + " loses :(");
                    }
        }
        System.out.println("_____________________________________________________\n");
    }

}