import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        NumberGuesser game = new RandomNumberGuesser();

        boolean playAgain = true;

        while (playAgain) {

            playOneGame(game, scnr);

            playAgain = shouldPlayAgain(scnr);

        }

    }

    public static void playOneGame(NumberGuesser game, Scanner scnr) {

        String response;

        //Initialize the game with instructions
        System.out.println("Guess a number from 1 to 100: ");

        //Provide the guess
        System.out.println("Is your number " + game.getCurrentGuess() + "? (h/l/c): ");

        do {
            //Get the user's answer
            response = scnr.next();
            if (response.equals("h")) {
                game.higher();
                System.out.println("It's higher?");
                System.out.println("What about " + game.getCurrentGuess() + "? (h/l/c): ");
            } else if (response.equals("l")) {
                game.lower();
                System.out.println("It's lower?");
                System.out.println("What about " + game.getCurrentGuess() + "? (h/l/c): ");
            } else if (response.equals("c")) {
                game.reset();
                System.out.println("Great! I guessed your number!");
            } else {
                System.out.println("That is not a valid input.");
            }
        } while (!response.equals("c"));



    }

    public static boolean shouldPlayAgain(Scanner scnr) {

        String playAgain;
        System.out.print("Do you want to play again? (y/n): ");

        playAgain = scnr.next();

        return playAgain.equals("y");
    }
}