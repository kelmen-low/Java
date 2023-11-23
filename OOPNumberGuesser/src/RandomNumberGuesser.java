import java.util.Random;

public class RandomNumberGuesser extends NumberGuesser {

    @Override
    public int getCurrentGuess() {

        // Arbitrarily set a seed value of 10 to invoke the same random value until range is modified
        Random newRand = new Random(10);

        currentGuess = newRand.nextInt(upperBound - lowerBound + 1) + lowerBound;
        return currentGuess;
    }
}
