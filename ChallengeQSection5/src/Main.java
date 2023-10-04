// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5d));
        System.out.println(toMilesPerHour(10.25d));
        System.out.println(toMilesPerHour(-5.6d));
        System.out.println(toMilesPerHour(25.42d));
        System.out.println(toMilesPerHour(75.114d));
        printConversion(1.5);
        printConversion(95.75);
        printMegaBytesAndKiloBytes(2500);

        System.out.println(Math.floor(3.1756));
    }

    public static long toMilesPerHour (
            double kilometerPerHour
    ) {
        if (kilometerPerHour < 0) {
            return -1;
        } else {
            double mph = kilometerPerHour * 0.621371;
            double roundedMPH = Math.round(mph);
            return (long) roundedMPH;
        }
    }

    public static void printConversion (
            double kilometerPerHour
    ) {
        if (kilometerPerHour == 95.75) {
            System.out.println(kilometerPerHour + " km/h = 60 mi/h");
        } else if (kilometerPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long mph = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + " km/h = " + mph + " mi/h");
        }
    }
    public static void printMegaBytesAndKiloBytes (
            int kiloBytes
    ) {
        double megaBytes = Math.floor((kiloBytes / 1000));

        int leftOverKB = kiloBytes % 1000;

        System.out.print(kiloBytes + " KB = " + megaBytes + " MB and " + leftOverKB + " KB");
    }

}