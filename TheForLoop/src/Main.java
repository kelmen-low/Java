// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5.0; rate += 1.0) {
            System.out.println(calculateInterest(10000,rate));
        }

        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            System.out.println(calculateInterest(100,rate));
            if (rate > 8.5) {
                break;
            }
        }
    }

    public static double calculateInterest(
            double amount,
            double interestRate
    ) {
        return(amount * (interestRate / 100));
    }
}