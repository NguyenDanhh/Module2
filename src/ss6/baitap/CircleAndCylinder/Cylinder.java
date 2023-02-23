package ss6.baitap.CircleAndCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolume() {
        return getRadius() * getRadius() * this.height * Math.PI;

    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                "height=" + height +
                " , Area : " + getArea() +
                " , Volume : " + getVolume() +
                '}';
    }
}
