package ss7.baitap.InterfaceResizeable;

public class CircleController {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        circle.setRadius(2.0);
        System.out.println(circle.resize(2));
    }
}
