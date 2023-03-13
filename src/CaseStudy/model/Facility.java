package CaseStudy.model;

public abstract class Facility {
    private String serviceName;
    private double Area;
    private String price;
    private int maximumPerson;
    private String rentalType;

    public Facility() {
    }

    public Facility(String name, double area, String price, int people, String rentalType) {
        this.serviceName = name;
        this.Area = area;
        this.price = price;
        this.maximumPerson = people;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        this.Area = area;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getMaximumPerson() {
        return maximumPerson;
    }

    public void setMaximumPerson(int maximumPerson) {
        this.maximumPerson = maximumPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Tên dịch vụ = " + serviceName + '\'' +
                ", Diện tích = " + Area +
                ", Giá = " + price + '\'' +
                ", Người Tối Đa = " + maximumPerson +
                ", Kiểu thuê = " + rentalType + '\'';
    }
}
