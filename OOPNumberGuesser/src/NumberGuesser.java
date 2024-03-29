public class NumberGuesser {

    // --- FIELDS ---
    protected int currentGuess;
    protected int upperBound;
    protected int lowerBound;

    // --- CONSTRUCTORS ---
    public NumberGuesser() {
        upperBound = 100;
        lowerBound = 1;
    }

    public NumberGuesser(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    // --- METHODS ---
    public void higher() {
        this.lowerBound = this.currentGuess;
    }

    public void lower() {
        this.upperBound = this.currentGuess;
    }

    public void reset() {
        upperBound = 100;
        lowerBound = 1;
    }

    public int getCurrentGuess() {

        //handle the edge case that the guess is 100
        if ((lowerBound == 99) && (upperBound == 100)) {
            return 100;
        }
        currentGuess = (upperBound + lowerBound) / 2;
        return currentGuess;
    }


}
