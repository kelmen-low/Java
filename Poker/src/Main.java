import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int matchCount = 0;
        boolean hasPair;
        boolean isStraight = true;
        int[] cards = new int[5];

        //print the welcome message
        System.out.println("Enter five numeric cards, no face cards. Use 2 - 9");

        //take 5 inputs of the cards provided
        for (int i = 0; i < 5; i++) {
            System.out.print("Card " + (i + 1) + ": ");
            cards[i] = scnr.nextInt();
            System.out.println();
        }

        //count how many cards match each other
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((cards[i] == cards[j]) && (i != j)) {
                     matchCount++;
                }
            }
        }

        //if 2 cards match eac other, return true
        hasPair = (matchCount == 2);

        //sort the cards from highest to lowest
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1 ; j < 5; j++) {
                if (cards[i] > cards[j]) {
                    int hold = cards[i];
                    cards[i] = cards[j];
                    cards[j] = hold;
                }
            }
        }

        //if the cards are sequentially increasing, keep isStraight as true, otherwise, return false
        if ((cards[0] + 1 != cards[1]) || (cards[1] + 1 != cards[2]) || (cards[2] + 1 != cards[3]) || (cards[3] + 1 != cards[4])) {
            isStraight = false;
        }

        //print the result based on pair or straight
        if (hasPair) {
            System.out.println("Pair!");
        } else if (isStraight) {
            System.out.println("Straight!");
        } else {
            System.out.println("Nothin'");
        }
    }
}