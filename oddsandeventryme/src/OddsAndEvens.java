import java.util.Random;
import java.util.Scanner;

public class OddsAndEvens {
    static Scanner SCANNER = new Scanner(System.in);
    static Random RANDOM = new Random();
    static char SYMBOL = '-';
    static int QUANTITY_SYMBOLS = 55;
    public static void main (String[] args){
        String odds;
        String evens;
        String playerChoose;
        String computerChoose;
        String result;
        String win;
        partLine(QUANTITY_SYMBOLS, SYMBOL);
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.print("What is your name? ");
        String name = SCANNER.nextLine();
        name = name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());// from 4.11: longestName
        System.out.printf("Hi %s, which do you choose? (O)dds or (E)vens? ", name);
        String choose = SCANNER.nextLine();
        if (choose.toLowerCase().startsWith("o")) {
            playerChoose = "odds";
            odds = name;
            computerChoose = "evens";
            evens = "Computer";
        } else {
            playerChoose = "evens";
            evens = name;
            computerChoose = "odds";
            odds = "Computer";
        }
        System.out.printf("%s has picked %s! The computer will be %s.\n", name, playerChoose, computerChoose);
        partLine(QUANTITY_SYMBOLS, SYMBOL);

        System.out.print("How many “fingers” do you put out? ");
        int fingers = SCANNER.nextInt();
        int computerFingers = RANDOM.nextInt(6);
        System.out.printf("The computer plays %d \"fingers\"\n", computerFingers);
        partLine(QUANTITY_SYMBOLS, SYMBOL);

        int sum  = fingers + computerFingers;
        System.out.printf("%d + %d = %d\n", fingers, computerFingers, sum);
        if (sum % 2 == 0) {
            result = "even";
            win = evens;
        } else {
            result = "odd";
            win = odds;
        }
        System.out.printf("%d is ... %s!\n", sum, result);
        System.out.printf("That means %s wins! :)\n", win);
        partLine(QUANTITY_SYMBOLS, SYMBOL);
    }

    static void partLine(int quantity, char symbol) {
        for (int i = 0; i < quantity; i++){
            System.out.print(symbol);
        }
        System.out.println();
    }
}