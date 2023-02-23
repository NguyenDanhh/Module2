package ss6.baitap.CircleAndCylinder;

public class CylindeController {
    public static void main(String[] args) {
        Circle cylinder = new Cylinder(1.0, " green", 10);
        Cylinder cylinder1 = new Cylinder(2.0, "Black", 20);
        System.out.println(cylinder.toString());
        System.out.println(cylinder1.toString());
    }
}
