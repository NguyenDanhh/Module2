package CaseStudy.model;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloor;

    public House() {
    }

    public House(String name, double area, String price, int people, String rentalType, String roomStandard, int numberOfFloor) {
        super(name, area, price, people, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
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
        return "House{" + super.toString() +
                "Tiêu chuẩn phòng='" + roomStandard + '\'' +
                ", Số tầng=" + numberOfFloor +
                '}';
    }
}

