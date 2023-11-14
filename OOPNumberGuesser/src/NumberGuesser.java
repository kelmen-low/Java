public class NumberGuesser {

    // --- FIELDS ---
    private int currentGuess;
    private int upperBound;
    private int lowerBound;

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

    // --- SETTERS ---
    public void setCurrentGuess(int currentGuess) {
        this.currentGuess = currentGuess;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    // --- GETTERS ---
    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
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
