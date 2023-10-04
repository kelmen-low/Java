// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int playerOneScore = 1500;
        int playerTwoScore = 1000;
        int playerThreeScore = 500;
        int playerFourScore = 100;
        int playerFiveScore = 25;

        int playerOnePosition = calculateHighScorePosition(playerOneScore);
        int playerTwoPosition = calculateHighScorePosition(playerTwoScore);
        int playerThreePosition = calculateHighScorePosition(playerThreeScore);
        int playerFourPosition = calculateHighScorePosition(playerFourScore);
        int playerFivePosition = calculateHighScorePosition(playerFiveScore);

        System.out.println(displayHighScorePosition("Player 1",playerOnePosition));
        System.out.println(displayHighScorePosition("Player 2",playerTwoPosition));
        System.out.println(displayHighScorePosition("Player 3",playerThreePosition));
        System.out.println(displayHighScorePosition("Player 4",playerFourPosition));
        System.out.println(displayHighScorePosition("Player 5",playerFivePosition));
    }

    public static String displayHighScorePosition(
            String playerName,
            int playerPosition
    ) {
        String myString = playerName + " managed to get into position " + playerPosition + " on the high score list.";
        return myString;
    }

    public static int calculateHighScorePosition (
            int playerScore
    ) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

}