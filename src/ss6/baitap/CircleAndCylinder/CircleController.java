package ss6.baitap.CircleAndCylinder;

public class CircleController {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        Circle circle1 = new Circle(1.0, "Black");
        System.out.println(circle1.toString());
    }
}
