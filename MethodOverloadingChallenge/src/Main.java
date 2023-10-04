// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(60));
        System.out.println(convertToCentimeters(5,8));
    }

    public static double convertToCentimeters(
            int heightInches
    ) {
        double heightInCM = heightInches * 2.54;
        return heightInCM;
    }

    public static double convertToCentimeters(
            int feet,
            int inches
    ) {
        int allInches = (12 * feet) + inches;
        return convertToCentimeters(allInches);
    }
}