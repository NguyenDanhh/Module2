package ss10.baitap.StudentManagement.Model;

public class Students extends Person {
    private String className;
    private double point;

    public Students() {
    }

    public Students(int id, String name, String dateOfBirth, Boolean gender, String className, double point) {
        super(id, name, dateOfBirth, gender);
        this.className = className;
        this.point = point;
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

    @Override
    public String toString() {
        return "Students{" + super.toString() +
                "className='" + className + '\'' +
                ", point=" + point +
                '}';
    }
}
