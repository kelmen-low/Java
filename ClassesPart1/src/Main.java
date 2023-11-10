// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);

        car.describeCar();

        Car targa = new Car();

        car.setMake("Porsche");
        car.setModel("Targa");
        car.setDoors(2);
        car.setConvertible(true);

        car.describeCar();
    }
}