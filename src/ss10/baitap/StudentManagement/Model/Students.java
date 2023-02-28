package ss10.baitap.StudentManagement.Model;

public class Students extends Person{
    private String className ;
    private  double point ;

    public Students() {
    }

    public Students(int id, String name, String dateOfBirth, Boolean gender, String className, double point, String className1, double point1) {
        super(id, name, dateOfBirth, gender, className, point);
        this.className = className1;
        this.point = point1;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}
