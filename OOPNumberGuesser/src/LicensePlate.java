public class LicensePlate {

    private String text;

    private String state;

    public LicensePlate() {
        this.text = "7RWD633";
        this.state = "CA";
    }

    public LicensePlate(String text, String state) {
        this.text = text;
        this.state = state;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean equals(LicensePlate plate) {
        return this.text.equals(plate.getText()) && this.state.equals(plate.getState());
    }

    public String toString() {
        return "Plate: " + this.text + "\nState: " + this.state;
    }
}
