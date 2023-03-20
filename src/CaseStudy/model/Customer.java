package CaseStudy.model;

public class Customer extends Person{
    private int idCustomer;
    private String typeOfGuest;
    private String address;
    public Customer() {
    }

    public Customer(String name, int identityCard, String dateOfBirth, String gender, int phoneNumber, String email, int idCustomer, String typeOfGuest, String address) {
        super(name, identityCard, dateOfBirth, gender, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "Mã khách hàng =" + idCustomer +
                ", Loại khách='" + typeOfGuest + '\'' +
                ", Địa chỉ ='" + address + '\'' +
                '}';
    }
    public String toCSV(){
        return super.getName() +","+ super.getIdentityCard() + "," + super.getDateOfBirth() + "," +
                super.getGender() + "," + super.getPhoneNumber() +","+ super.getEmail() +","+
                idCustomer + "," + typeOfGuest + "," + address;
    }
}
