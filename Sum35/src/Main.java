// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int totalNum = 0;
        int finalSum = 0;

        for (int i = 1; i <= 1000; i++) {
             if (i % 3 == 0 && i % 5 == 0) {
                 System.out.println(i);
                 finalSum += i;
                 totalNum += 1;

                 if (totalNum > 4) {
                     break;
                 }
             }
        }

        System.out.println("Final sum is " + finalSum);

        System.out.println(sumOdd(10,5));
    }

    public static boolean isOdd (
            int number
    ) {
        if (number <= 0) {
            return false;
        }
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd (
            int start,
            int end
    ) {
        int sum = 0;
        for (int number = start; number <= end; number += 1) {
            if (number < start || number <= 0) {
                return -1;
            }
            if (isOdd(number)) {
                sum += number;
            }
        }

        return sum;
    }
}