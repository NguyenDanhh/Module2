package ss7.thuchanh.InterfaceComparable;

public abstract class Circle {
    private boolean filled;
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
    }


    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }



    public Circle() {

    }

    public Circle(double radius, String color , boolean filled) {
        this.filled = filled;
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract int compareTo(ComparableCircle o);
}
