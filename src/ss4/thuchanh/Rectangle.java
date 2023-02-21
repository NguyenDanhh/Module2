package ss4.thuchanh;

public class Rectangle {
    float width , height ;
    public Rectangle(float width , float height){
        this.width = width;
        this.height = height;
    }
    public float getArea(){
        return  this.width * this.height;
    }
    public float getPerimeter(){
        return (this.height + this.width)*2;
    }
    public String toString(){
        return "Rectangal {" + "width = " + width +  " , height = " + height + "}";
    }
}
