package CaseStudy.service.Facility.impl;

import CaseStudy.model.House;
import CaseStudy.repository.Facility.impl.HouseRepository;
import CaseStudy.service.Facility.IHouseService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseService implements IHouseService {
    private static HouseRepository houseRepository = new HouseRepository();
    private static final String PATH ="src/CaseStudy/data/file_house.csv";
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        List<House> list = houseRepository.getAll();
        for (House element : list) {
            System.out.println(element);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập số nhà");
        int id = Integer.parseInt(scanner.nextLine());
        if (checkBoolean(id) == true){
            System.out.println("Số nhà đã tồn tại ");
        }else {
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
            System.out.println("Nhập số tầng");
            int numberOfFloor = Integer.parseInt(scanner.nextLine());
            House house = new House(id ,name,area,price,people , retalType ,roomStandard,numberOfFloor);
            houseRepository.add(PATH , house);
        }
    }
    public static Boolean checkBoolean(int id  ){
       List<House> list = houseRepository.getAll();
        for (House element : list) {
            if(element.getId() == id  ){
                return true;
            }
        }
        return false;
    }
}
