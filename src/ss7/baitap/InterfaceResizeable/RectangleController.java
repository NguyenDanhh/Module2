package ss7.baitap.InterfaceResizeable;

public class RectangleController {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.toString());
        rectangle.setWidth(3);
        rectangle.setHeight(3);
        System.out.println(rectangle.resize(2));

    }
}
