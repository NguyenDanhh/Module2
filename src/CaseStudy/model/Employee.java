package CaseStudy.model;

public class Employee extends Person {
    private int idEmploye;
    private String level;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String name, int identityCard, String dateOfBirth, String gender, int phoneNumber, String email, int idEmploye, String level, String position, String salary) {
        super(name, identityCard, dateOfBirth, gender, phoneNumber, email);
        this.idEmploye = idEmploye;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "Mã Nhân viên=" + idEmploye +
                ", Trình độ='" + level + '\'' +
                ", Vị trí ='" + position + '\'' +
                ", Lương='" + salary + '\'' +
                '}';
    }
}
