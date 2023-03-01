package ss10.baitap.StudentManagement.Model;

public class Teacher extends Person{
    private String specialize ;

    public Teacher() {
    }

    public Teacher(int id, String name, String dateOfBirth, Boolean gender, String specialize) {
        super(id, name, dateOfBirth, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }
}
