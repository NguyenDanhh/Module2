package ss5.baitap.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * 2;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Area=" + getArea() +
                ", Radius='" + getRadius() + '\'' +
                '}';
    }
}
