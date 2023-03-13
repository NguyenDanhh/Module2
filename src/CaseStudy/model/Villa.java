package CaseStudy.model;

public class Villa extends Facility{
    private String roomStandard;
    private double swimmingPoolArea;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String name, double area, String price, int people, String rentalType, String roomStandard, double swimmingPoolArea, int numberOfFloor) {
        super(name, area, price, people, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "Tiêu chuẩn phòng ='" + roomStandard + '\'' +
                ",Diện tích hồ bơi=" + swimmingPoolArea +
                ", Số tầng =" + numberOfFloor +
                '}';
    }
}
