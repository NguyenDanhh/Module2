package ss10.baitap.StudentManagement.Model;

public abstract class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private Boolean gender;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirth, Boolean gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "id= " + id +
                ", name=' " + name + '\'' +
                ", dateOfBirth=' " + dateOfBirth + '\'' +
                ", gender= " + gender;
    }
}
