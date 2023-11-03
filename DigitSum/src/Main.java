import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double inValue;
        double maximumVal = 0.0;
        int i;

        for (i = 0; i < 7; i++) {

            inValue = scnr.nextInt();

            if (i == 0) {
                maximumVal = inValue;
            } else {
                if (inValue > maximumVal) {
                    maximumVal = inValue;
                }
            }
        }

        System.out.println(maximumVal);
    }

}