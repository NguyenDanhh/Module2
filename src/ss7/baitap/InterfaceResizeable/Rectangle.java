package ss7.baitap.InterfaceResizeable;

public class Rectangle implements IResizeable {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double resize(double percent) {
        return (width * height * percent) / 100;
    }
}
