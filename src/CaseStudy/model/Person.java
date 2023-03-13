package CaseStudy.model;

public abstract class Person {
    private String name;
    private int identityCard;
    private String dateOfBirth;
    private String gender;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, int identityCard, String dateOfBirth, String gender, int phoneNumber, String email) {
        this.name = name;
        this.identityCard = identityCard;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Tên ='" + name + '\'' +
                ",CMND =" + identityCard +
                ", Ngày sinh='" + dateOfBirth + '\'' +
                ", Giới tính ='" + gender + '\'' +
                ", Số điện thoại =" + phoneNumber +
                ", email='" + email + '\'';
    }
}
