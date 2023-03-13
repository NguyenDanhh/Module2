package CaseStudy.model;

public class Room extends Facility{
    private String dichVuDiKem;

    public Room() {
    }

    public Room(String name, double area, String price, int people, String rentalType, String dichVuDiKem) {
        super(name, area, price, people, rentalType);
        this.dichVuDiKem = dichVuDiKem;
    }

    public String getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "dichVuDiKem='" + dichVuDiKem + '\'' +
                '}';
    }
}
