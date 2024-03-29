import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int average = 0;
        int max = 0;
        int numInputs = 0;
        int sums = 0;
        int input = 0;

        do {
            input = scnr.nextInt();
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
