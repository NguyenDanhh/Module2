package CaseStudy.model;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloor;
    private String id;

    public House() {
    }


    public House(String id, String name, double area, double price, int people, String rentalType, String roomStandard, int numberOfFloor) {
        super(name, area, price, people, rentalType);
        this.id = id;
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "House{" + "Mã dịch vụ =" + id + "," + super.toString() +
                ", Tiêu chuẩn phòng='" + roomStandard + '\'' +
                ", Số tầng=" + numberOfFloor +
                '}';
    }

    public String toCSV() {
        return id + "," + super.getServiceName() + "," + super.getArea() + "," + super.getPrice() + "," + super.getMaximumPerson() +
                "," + super.getRentalType() + "," + roomStandard + "," + numberOfFloor;
    }
}

