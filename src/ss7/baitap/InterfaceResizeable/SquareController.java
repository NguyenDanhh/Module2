package ss7.baitap.InterfaceResizeable;

public class SquareController {
    public static void main(String[] args) {
        Square square = new Square();
        square.setWidth(20);
        System.out.println(square.toString());
        System.out.println(square.resize(50));
    }
}
