package CaseStudy.model;

public class Room extends Facility{
    private String accompaniedService;

    public Room() {
    }

    public Room(String name, double area, String price, int people, String rentalType, String accompaniedService) {
        super(name, area, price, people, rentalType);
        this.accompaniedService = accompaniedService;
    }

    public String getAccompaniedService() {
        return accompaniedService;
    }

    public void setAccompaniedService(String accompaniedService) {
        this.accompaniedService = accompaniedService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "Dịch vụ đi kèm ='" + accompaniedService + '\'' +
                '}';
    }
}
