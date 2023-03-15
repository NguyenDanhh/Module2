package CaseStudy.service.Facility.impl;

import CaseStudy.model.House;
import CaseStudy.model.Room;
import CaseStudy.repository.Facility.impl.HouseRepository;
import CaseStudy.repository.Facility.impl.RoomRepository;
import CaseStudy.service.Facility.IRoomService;

import java.util.List;
import java.util.Scanner;

public class RoomService implements IRoomService {
    private static RoomRepository roomRepository = new RoomRepository();
    private static final String PATH ="src/CaseStudy/data/file_room.csv";
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        List<Room> list = roomRepository.getAll();
        for (Room element : list) {
            System.out.println(element);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập mã phòng ");
        int id = Integer.parseInt(scanner.nextLine());
        if(checkBoolean(id) == true){
            System.out.println("Phòng đã tồn tại");
        }else {
            System.out.println("Nhập tên dịch vụ ");
            String name = scanner.nextLine();
            System.out.println("Nhập diện tích ");
            double area = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập giá ");
            String price = scanner.nextLine();
            System.out.println("Nhập số người tối đa");
            int people = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập loại cho thuê");
            String retalType = scanner.nextLine();
            System.out.println("Nhập dịch vụ theo kèm ");
            String accompanied = scanner.nextLine();
            Room room = new Room(id,name,area,price,people,retalType,accompanied);
            roomRepository.add(PATH , room);
        }
    }
    public static Boolean checkBoolean(int id  ){
        List<Room> list = roomRepository.getAll();
        for (Room element : list) {
            if(element.getId() == id  ){
                return true;
            }
        }
        return false;
    }
}
