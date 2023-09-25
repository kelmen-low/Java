public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Kelmen");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 90;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second topscore and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? true : false;

        if (isDomestic) {
            System.out.println("This car is domestic");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double myDoubleVar = 20.00;
        double mySecondVar = 80.00;
        double mySum = (myDoubleVar + mySecondVar) * 100;

        double remainder = mySum % 40.30;

        boolean isZero = remainder == 0.00 ? true : false;

        if (!isZero) {
            System.out.println("You got some remainder dawg");
        }
    }
}
