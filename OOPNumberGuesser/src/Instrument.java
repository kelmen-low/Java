import javax.sound.midi.Instrument;

// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class Instrument {
    // TODO: Declare private fields
    private int numOfStrings;
    private int numOfFrets;
    private boolean isBowed;

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfFrets() {
        return numOfFrets;
    }

    public void setNumOfFrets(int numOfFrets) {
        this.numOfFrets = numOfFrets;
    }

    public boolean getIsBowed() {
        return isBowed;
    }

    public void setIsBowed(boolean bowed) {
        isBowed = bowed;
    }
}