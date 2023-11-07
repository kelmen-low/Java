import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean playAgain = true;

        while (playAgain) {

            playOneGame();

            playAgain = shouldPlayAgain();

        }

    }

    public static void playOneGame() {
        String response;

        //initialize full range of guesses and the guess itself
        int lowerBound = 1;
        int upperBound = 101;
        int midpoint = getMidpoint(lowerBound, upperBound);

        // get the player's input
        System.out.print("Guess a number from 1 to 100: ");

        // quit this loop once the user responds with "c"
        do {
            // get the user response if it is too high or too low
            response = getUserResponseToGuess(midpoint);

            // change the midpoint to higher or lower based on the response
            if (response.equals("h")) {
                lowerBound = midpoint;
                midpoint = getMidpoint(lowerBound, upperBound);
            } else if (response.equals("l")) {
                upperBound = midpoint;
                midpoint = getMidpoint(lowerBound, upperBound);
            } else if (response.equals("c")) {
                System.out.print("Great! ");
            } else {
                System.out.println("That's not a valid input. Please try again. ");
            }
        } while (!response.equals("c"));

    }

    public static boolean shouldPlayAgain() {

        Scanner scnr = new Scanner(System.in);
        String playAgain;
        System.out.print("Do you want to play again? (y/n): ");

        playAgain = scnr.next();

        return playAgain.equals("y");

    }

    public static String getUserResponseToGuess(int midpoint) {

        Scanner scnr = new Scanner(System.in);
        String input;

        System.out.print("Is it " + midpoint + "? (h/l/c) ");
        input = scnr.next();

        return input;
    }

    public static int getMidpoint(int low, int high) {

        // This handles the edge case of guess 100 to circumvent the automatic round-down of dropping decimals
        if (low == 99 && high == 101) {
            return 100;
        } else {
            return (low + (high - 1)) / 2;
        }
    }
}