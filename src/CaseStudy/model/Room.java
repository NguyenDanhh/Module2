package CaseStudy.model;

public class Room extends Facility{
    private String id ;
    private String accompaniedService;

    public Room() {
    }

    public Room(String id ,String name, double area, double price, int people, String rentalType, String accompaniedService) {
        super(name, area, price, people, rentalType);
        this.id = id ;
        this.accompaniedService = accompaniedService;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccompaniedService() {
        return accompaniedService;
    }

    public void setAccompaniedService(String accompaniedService) {
        this.accompaniedService = accompaniedService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "Mã Dịch vụ =" + id + "," + super.toString()+
                ", accompaniedService='" + accompaniedService + '\'' +
                '}';
    }

    //    String name, double area, String price, int people, String rentalType, String accompaniedService
    public String toCSV(){
        return id + "," + super.getServiceName() + "," + super.getArea() +"," + super.getPrice() +"," +super.getMaximumPerson() +"," +
                super.getRentalType() +"," + accompaniedService;
    }
}
