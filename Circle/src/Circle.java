public class Circle {

    private double radius;
    private double x;
    private double y;

    public Circle (double x, double y, double radius){

        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public boolean doesOverlap(Circle otherCircle) {

        //get the X and Y coordinates of the other circle
        double otherCircleX = otherCircle.getX();
        double otherCircleY = otherCircle.getY();

        // get the distance in the X and Y directions between the center of the circles
        double distanceBetweenX = Math.abs(this.x - otherCircleX);
        double distanceBetweenY = Math.abs(this.y - otherCircleY);

        // find the straight line distance using pythagorean theorem
        double distanceBetweenCenters = Math.sqrt(Math.pow(distanceBetweenX, 2) + Math.pow(distanceBetweenY, 2));

        // add the radii together of both circles
        double combinedRadius = this.radius + otherCircle.getRadius();

        // return true if the circle overlap
        return combinedRadius > distanceBetweenCenters;

    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
