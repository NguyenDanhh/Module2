package ss4.baitap.Fan;

public class Fan {
    final byte SLOW = 1, MEDIUM = 2, FAST = 3;
    public byte Speed = SLOW;
    public boolean on = false;
    public double radius = 5;
    public String color = "blue";

    public byte getSLOW() {
        return SLOW;
    }

    public byte getMEDIUM() {
        return MEDIUM;
    }

    public byte getFAST() {
        return FAST;
    }

    public byte getSpeed() {
        return Speed;
    }

    public void setSpeed(byte speed) {
        Speed = speed;
    }

    public boolean isOn() {
        return on = true;
    }

    public boolean isOff() {
        return on = false;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {

    }

    @Override
    public String toString() {
        if (on == true) {
            System.out.println("fan is on");
            return "Fan{" +
                    "SLOW=" + SLOW +
                    ", MEDIUM=" + MEDIUM +
                    ", FAST=" + FAST +
                    ", Speed=" + Speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            System.out.println("fan is off");
        }


        return null;
    }
}
