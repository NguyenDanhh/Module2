package ss5.baitap.AccessModifier;

public class CircleController {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        Circle circle1 = new Circle(2.0);
        System.out.println(circle1.toString());

    }
}
