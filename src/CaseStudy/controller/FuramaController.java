package CaseStudy.controller;

import CaseStudy.service.impl.EmployeeService;

import java.util.Scanner;

public class FuramaController {
    public void menuController() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Quản lý khách sạn ");
            System.out.println("--------------------");
            System.out.println("1.Quản lý nhân sự \n" +
                    "2.Quản lý khách hàng \n" +
                    "3.Quản lý cơ sở \n" +
                    "4.Quản lý đặt phòng \n" +
                    "5.Quản lý khuyến mãi \n" +
                    "6.Thoát \n" +
                    "Mời chọn chức năng");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    EmployeeService employeeService = new EmployeeService();
                    int choice1;
                    do {
                        System.out.println("Quản lý nhân sự ");
                        System.out.println("--------------------");
                        System.out.println("1.Hiển thị danh sách nhân viên \n" +
                                "2.Thêm nhân viên mới \n" +
                                "3.Chỉnh sửa nhân viên \n" +
                                "4.Quay lại menu");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                employeeService.display();
                                break;
                            case 2:
                                employeeService.add();
                                break;
                            case 3:
                                employeeService.editEmployee();
                                break;
                        }
                    } while (choice1 > 0 && choice1 < 4);
                    break;
                case 2:
                    int choice2;
                    do {
                        System.out.println("Quản lý khách hàng  ");
                        System.out.println("--------------------");
                        System.out.println("1.Hiển thị danh sách khách hàng \n" +
                                "2.Thêm khách hàng mới \n" +
                                "3.Chỉnh sửa khách hàng  \n" +
                                "4.Quay lại menu");
                        choice2 = Integer.parseInt(scanner.nextLine());
                    } while (choice2 > 0 && choice2 < 4);
                    break;
                case 3:
                    int choice3;
                    do {
                        System.out.println("Quản lý cơ sở  ");
                        System.out.println("--------------------");
                        System.out.println("1.Hiển thị danh sách cơ sở \n" +
                                "2.Thêm cơ sở mới \n" +
                                "3.Hiển thị danh sách bảo trì cơ sở  \n" +
                                "4.Quay lại menu");
                        choice3 = Integer.parseInt(scanner.nextLine());
                    } while (choice3 > 0 && choice3 < 4);
                    break;
                case 4:
                    int choice4;
                    do {
                        System.out.println("Quản lý đặt phòng  ");
                        System.out.println("--------------------");
                        System.out.println("1.Hiển thị danh sách đặt phòng \n" +
                                "2.Thêm đặt phòng mới mới \n" +
                                "3.Tạo hợp đồng mới \n" +
                                "4.Hiển thị danh sách đặt phòng \n" +
                                "5.Chỉnh sửa hợp đồng" +
                                "6.Quay lại menu chình");
                        choice4 = Integer.parseInt(scanner.nextLine());
                    } while (choice4 > 0 && choice4 < 6);
                    break;
                case 5:
                    int choice5;
                    do {
                        System.out.println("Quản lý khuyến mãi  ");
                        System.out.println("--------------------");
                        System.out.println("1.Hiển thị danh sách khách hàng sử dụng dịch vụ \n" +
                                "2.Hiển thị danh sách khách hàng nhận voucher \n" +
                                "3.Quay lại menu chính");
                        choice5 = Integer.parseInt(scanner.nextLine());
                    } while (choice5 > 0 && choice5 < 3);
                    break;

            }
        } while (choice > 0 && choice < 6);
    }
}
