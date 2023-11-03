public class Main {
    public static void main(String[] args) {

        int i = 0;
        int numberOfEvens = 0;
        int numberOfOdds = 0;

        while (i < 20) {
            i++;
            if (!isEven(i)) {
                continue;
            }
            numberOfEvens++;
            if (numberOfEvens > 5) {
                break;
            }
            numberOfOdds++;
            System.out.println(i);


        }

        System.out.println(numberOfEvens -1);
        System.out.println(numberOfOdds);
    }

    public static boolean isEven (
            int number
    ) {
        return number % 2 == 0;
    }
}