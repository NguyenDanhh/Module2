package CaseStudy.model;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloor;
    private int id;

    public House() {
    }


    public House(int id, String name, double area, String price, int people, String rentalType, String roomStandard, int numberOfFloor) {
        super(name, area, price, people, rentalType);
        this.id = id;
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return "House{" +"Số nhà =" + super.toString() +
                "Tiêu chuẩn phòng='" + roomStandard + '\'' +
                ", Số tầng=" + numberOfFloor +
                '}';
    }

    public String toCSV() {
        return super.getServiceName() + "," + super.getArea() + "," + super.getPrice() + "," + super.getMaximumPerson() +
                "," + super.getRentalType() + "," + roomStandard + "," + numberOfFloor;
    }
}

