package ss7.baitap.InterfaceResizeable;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(float width) {
        setWidth(width);
    }

    public String toString(){
        return "Square = " + getWidth();
    }
    @Override
    public double resize(double percent){
        return (getWidth() * percent) / 100;
    }
}
