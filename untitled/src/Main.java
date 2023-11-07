import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        double average = 0;
        double max = 0;
        int numInputs = 0;
        double sums = 0;
        double input;

        do {
            input = scnr.nextDouble();
            numInputs++;
            sums += input;

            if (numInputs == 1) {
                max = input;
            } else {
                if (input > max) {
                    max = input;
                } else {
                    continue;
                }
            }
        } while (input >= 0);

        average = sums / numInputs;

        System.out.printf("%.2f\n", average);
        System.out.printf("%.2f\n", max);

    }
}
