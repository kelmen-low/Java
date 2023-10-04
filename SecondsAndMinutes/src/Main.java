// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(60,59));
        System.out.println(getDurationString(-1,59));
        System.out.println(getDurationString(60,-1));
        System.out.println(getDurationString(60,63));
        System.out.println(getDurationString(23423));
        System.out.println(getDurationString(60,63));

    }

    public static String getDurationString(
            int seconds
    ) {

        if (seconds <= 0) {
            return "There is no negative time.";
        } else {
            int hours = (int) Math.floor(seconds / 3600);
            int leftoverSeconds = seconds % 3600;

            int minutes = (int) Math.floor(leftoverSeconds / 60);
            int leftoverSeconds2 = leftoverSeconds % 60;

            return hours + "HR " + minutes + "MIN " + leftoverSeconds2 + "SEC";

        }


    }

    public static String getDurationString(
            int minutes,
            int seconds
    ) {

        if (seconds <= 0 || minutes <= 0) {
            return "There is no negative time.";
        } else if (seconds > 59) {
            return "Input seconds over 59 should be converted to minutes.";
        } else{
            int allSeconds = (minutes * 60) + seconds;

            return getDurationString(allSeconds);
        }


    }
    public static void printYearsAndDays (
            long minutes
    ) {

        // Error checking: Reject values less than 0 (Invalid Value)
        if (minutes < 0) {

            System.out.println("Invalid Value");

        } else {

            // Use minutes to calculate days
            long days = minutes / 1440L;

            // Calculate years based on days
            long years = Math.floor(days / 365L);

            // Calculate the leftover days not used in the year calculation
            long leftoverDays = Math.floor(days % 365L);

            // Print the combined YY y and ZZ d statement
            System.out.println(minutes + " min = " years + " y and " + leftoverDays + " d");
        }
    }
}