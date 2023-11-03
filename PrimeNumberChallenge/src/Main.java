// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int notPrimeNumberCounter = 0;
        int primeNumberCounter = 0;

        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeNumberCounter += 1;
            } else {
                notPrimeNumberCounter += 1;
            }
        }

        System.out.println(primeNumberCounter);
    }

    public static boolean isPrime (
            int wholeNumber
    ) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}