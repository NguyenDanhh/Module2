package CaseStudy.service.Facility.impl;
import CaseStudy.common.Validate;
import CaseStudy.model.Villa;
import CaseStudy.repository.Facility.impl.VillaRepository;
import CaseStudy.service.Facility.IVillaService;
import java.util.List;
import java.util.Scanner;

public class VillaService implements IVillaService {
    private static VillaRepository villaRepository = new VillaRepository();
    private static final String PATH = "src/CaseStudy/data/file_villa.csv";
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Villa> list = villaRepository.getAll();
        for (Villa element : list) {
            System.out.println(element);
        }
    }

    @Override
    public void add() {
        String id;
        do {
            System.out.println("Nhập mã dịch vụ (SVVL-XXXX)");
            id = scanner.nextLine();
            if (Validate.validateVilla(id)) {
                if (checkBoolean(id)) {
                    System.out.println("Mã dịch đã tồn tại ");
                } else {
                    String name;
                    do {
                        System.out.println("Nhập tên dịch vụ ");
                        name = scanner.nextLine();
                        if(Validate.validateServiceName(name)){
                            break;
                        }else {
                            System.out.println("Tên dịch vụ chữ cái đầu phải viết hoa . Mời nhập lại");
                        }
                    }while (true);
                    System.out.println("Nhập diện tích villa");
                    double area ;
                    do {
                        area = Double.parseDouble(scanner.nextLine());
                        if(area > 30 ){
                            break;
                        }else {
                            System.out.println("Diện tích phải lớn hơn 30m2");
                        }
                    }while (true);
                    System.out.println("Nhập giá villa");
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
                        if(people > 0 && people < 20){
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
                    System.out.println("Nhập tiêu chuẩn phòng ");
                    String roomStandard;
                    do {
                        roomStandard = scanner.nextLine();
                        if(Validate.validateServiceName(roomStandard)){
                            break;
                        }else {
                            System.out.println("Tiêu chuẩn phòng chữ cái đầu phải viết hoa . Mời nhập lại !");
                        }
                    }while (true);
                    System.out.println("Nhập diện tích hồ bơi villa");
                    double swimmingPoolArea ;
                    do {
                        swimmingPoolArea = Double.parseDouble(scanner.nextLine());
                        if(swimmingPoolArea >= 45 ){
                            break;
                        }else {
                            System.out.println("Diện tích phải lớn hơn 45m2");
                        }
                    }while (true);
                    System.out.println("Nhập số tầng villa");
                    int numberOfFloor ;
                    do {
                        numberOfFloor = Integer.parseInt(scanner.nextLine());
                        if (numberOfFloor > 0 ){
                            break;
                        }else {
                            System.out.println("Số tầng phải lớn hơn 0 ! Mời nhập lại");
                        }
                    }while (true);
                    Villa villa = new Villa(id, name, area, price, people, retalType, roomStandard, swimmingPoolArea, numberOfFloor);
                    villaRepository.add(PATH, villa);
                    System.out.println("Thêm thành công");
                }
                return;
            }else {
                System.out.println("Mã định dạng không đúng . Mời nhập lại ");
            }
        } while (Validate.validateVilla(id));


    }

    public static Boolean checkBoolean(String id) {
        List<Villa> list = villaRepository.getAll();
        for (Villa element : list) {
            if (element.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
