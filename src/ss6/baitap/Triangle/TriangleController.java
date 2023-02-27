package ss6.baitap.Triangle;

public class TriangleController {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setHeight(20);
        System.out.println(triangle.getArea());
        triangle.setHeight(10);
        triangle.setSide1(1);
        triangle.setSide2(2);
        triangle.setSide3(4);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.toString());
    }
}
