package ss4.baitap.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.isOn();

        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.SLOW);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.isOff();

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
