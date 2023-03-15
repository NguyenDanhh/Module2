package CaseStudy.service.Facility.impl;

import CaseStudy.model.House;
import CaseStudy.model.Room;
import CaseStudy.model.Villa;
import CaseStudy.repository.Facility.impl.RoomRepository;
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
        System.out.println("Nhập mã villa");
        int id = Integer.parseInt(scanner.nextLine());
        if (checkBoolean(id) == true) {
            System.out.println("Số nhà đã tồn tại ");
        } else {
            System.out.println("Nhập tên dịch vụ ");
            String name = scanner.nextLine();
            System.out.println("Nhập diện tích");
            double area = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập giá  ");
            String price = scanner.nextLine();
            System.out.println("Nhập số người tối đa ");
            int people = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập loại cho thuê");
            String retalType = scanner.nextLine();
            System.out.println("Nhập tiêu chuẩn phòng ");
            String roomStandard = scanner.nextLine();
            System.out.println("Nhập diện tích hồ bơi ");
            double swimmingPoolArea = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập số tầng");
            int numberOfFloor = Integer.parseInt(scanner.nextLine());
            Villa villa = new Villa(id, name, area, price, people, retalType, roomStandard, swimmingPoolArea, numberOfFloor);
            villaRepository.add(PATH, villa);
        }
    }

    public static Boolean checkBoolean(int id) {
        List<Villa> list = villaRepository.getAll();
        for (Villa element : list) {
            if (element.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
