public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3,4,5);
        Circle circle2 = new Circle(-3, -4, 4);
        Circle circle3 = new Circle(4,5,5);

        System.out.println("Here are the three circles' areas: " +
                "\nCircle 1: " + circle1.getArea() +
                "\nCircle 2: " + circle2.getArea() +
                "\nCircle 3: " + circle3.getArea());


        if (circle1.doesOverlap(circle3)) {
            System.out.println("Circle 1 overlaps with Circle 3");
        } else {
            System.out.println("Circle 1 does not overlap with Circle 3");
        }

        if (circle1.doesOverlap(circle2)) {
            System.out.println("Circle 1 overlaps with Circle 2");
        } else {
            System.out.println("Circle 1 does not overlap with Circle 2 ");
        }
    }
}