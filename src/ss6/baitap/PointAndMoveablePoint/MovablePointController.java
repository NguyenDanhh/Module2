package ss6.baitap.PointAndMoveablePoint;

public class MovablePointController {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint.move());
        MovablePoint movablePoint1 = new MovablePoint(1.0f , 2.0f , 3.0f , 3.0f);
        System.out.println(movablePoint1.toString());
        System.out.println(movablePoint1.move());

    }
}
