package CaseStudy.service.Facility.impl;

import CaseStudy.common.Validate;
import CaseStudy.model.Room;
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
        String id ;
        do {
            System.out.println("Nhập mã dịch vụ (SVRO-XXXX)");
            id=scanner.nextLine();
            if(Validate.vailidateRoom(id)){
                if(checkBoolean(id)){
                    System.out.println("Mã dịch vụ đã tồn tại");
                    return;
                }else {
                    String name;
                    do {
                        System.out.println("Nhập tên dịch vụ ");
                        name = scanner.nextLine();
                        if(Validate.validateServiceName(name) ){
                            break;
                        }else {
                            System.out.println("Tên dịch vụ chữ cái đầu phải viết hoa . Mời nhập lại");
                        }
                    }while (true);
                    System.out.println("Nhập diện tích phòng");
                    double area ;
                    do {
                        area = Double.parseDouble(scanner.nextLine());
                        if(area > 15 ){
                            break;
                        }else {
                            System.out.println("Diện tích phải lớn hơn 15m2");
                        }
                    }while (true);
                    System.out.println("Nhập giá phòng");
                    double price;
                    do {
                        price = Double.parseDouble(scanner.nextLine());
                        if(price > 0){
                            break;
                        }else {
                            System.out.println("Giá phải là số dương ! Mời nhập lại !");
                        }
                    }while (true);
                    System.out.println("Nhập số người tối đa");
                    int people ;
                    do {
                        people = Integer.parseInt(scanner.nextLine());
                        if(people > 0 && people < 5){
                            break;
                        }else {
                            System.out.println("Số lượng người tối đa phải lớn hơn 0 và nhỏ hơn 20 ! Mời nhập lại !");
                        }
                    }while (true);
                    String retalType;
                    System.out.println("Nhập loại cho thuê ");
                    do {
                        retalType = scanner.nextLine();
                        if(Validate.validateServiceName(retalType)){
                            break;
                        }else {
                            System.out.println("Loại cho thuê chữ cái đầu phải viết hoa . Mời nhập lại !");
                        }
                    }while (true);
                    System.out.println("Nhập dịch vụ theo kèm ");
                    String accompanied = scanner.nextLine();
                    Room room = new Room(id,name,area,price,people,retalType,accompanied);
                    roomRepository.add(PATH , room);
                    System.out.println("Thêm thành công !");
                }
                return;
            }else {
                System.out.println("Không đúng mã định dạng . Mời nhập lại !");
            }
        }while (Validate.vailidateRoom(id));


    }
    public static Boolean checkBoolean(String id  ){
        List<Room> list = roomRepository.getAll();
        for (Room element : list) {
            if(element.getId() == id  ){
                return true;
            }
        }
        return false;
    }
}
