package CaseStudy.model;

public class Villa extends Facility{
    private String roomStandard;
    private double swimmingPoolArea;
    private int numberOfFloor;
    private String id ;

    public Villa() {
    }

    public Villa(String id ,String name, double area, double price, int people, String rentalType, String roomStandard, double swimmingPoolArea, int numberOfFloor) {
        super(name, area, price, people, rentalType);
        this.id = id ;
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
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
        return "Villa{" +"Mã Dịch vụ =" + id +","+ super.toString() +
                " ,Tiêu chuẩn phòng ='" + roomStandard + '\'' +
                ",Diện tích hồ bơi=" + swimmingPoolArea +
                ", Số tầng =" + numberOfFloor +
                '}';
    }
    public String toCSV(){
        return id +","+super.getServiceName() +","+ super.getArea() +","+super.getPrice() +"," +super.getMaximumPerson()+","+
                super.getRentalType() + "," + roomStandard +"," + swimmingPoolArea + "," + numberOfFloor;
    }
}
