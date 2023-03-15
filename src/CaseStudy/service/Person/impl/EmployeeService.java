package CaseStudy.service.Person.impl;

import CaseStudy.model.Employee;
import CaseStudy.repository.Person.impl.EmployeeRepository;
import CaseStudy.service.Person.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static final String PATH = "src/CaseStudy/data/file_employee.csv";
    private static EmployeeRepository employeeRepository = new EmployeeRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void editEmployee() {
        List<Employee> list = employeeRepository.getAll();
        System.out.println("Nhập id cần chỉnh sửa ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdEmploye() == id) {
                Employee employees = new Employee();
                System.out.println("Nhập tên cần chỉnh sửa nhân viên ");
                String name = scanner.nextLine();
                employees.setName(name);
                System.out.println("Nhập CMND cần chỉnh sửa nhân viên ");
                int identityCard = Integer.parseInt(scanner.nextLine());
                employees.setIdentityCard(identityCard);
                System.out.println("Nhập ngày tháng năm sinh cần chỉnh sửa nhân viên");
                String dateOfBirth = scanner.nextLine();
                employees.setDateOfBirth(dateOfBirth);
                System.out.println("Nhập giới tính cần chỉnh sửa nhân viên");
                String gender = scanner.nextLine();
                employees.setGender(gender);
                System.out.println("Nhập số điện thoại cần chỉnh sửa nhân viên");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                employees.setPhoneNumber(phoneNumber);
                System.out.println("Nhập email cần chỉnh sửa nhân viên");
                String email = scanner.nextLine();
                employees.setEmail(email);
                System.out.println("Nhập trình độ cần chỉnh sửa nhân viên");
                String level = scanner.nextLine();
                employees.setLevel(level);
                System.out.println("Nhập vị trí cần chỉnh sửa nhân viên");
                String position = scanner.nextLine();
                employees.setPosition(position);
                System.out.println("Nhập lương cần chỉnh sửa nhân viên");
                String salary = scanner.nextLine();
                employees.setSalary(salary);
                Employee employee = new Employee(name, identityCard, dateOfBirth, gender, phoneNumber, email, id, level, position, salary);
                employeeRepository.editEmployee(i, employee, list);
                return;
            }
        }
        System.out.println("Id không tồn tại");
    }

    @Override
    public void display() {
        List<Employee> list = employeeRepository.getAll();
        for (Employee element : list) {
            System.out.println(element);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập id nhân viên");
        int id = Integer.parseInt(scanner.nextLine());
        if (checkBoolean(id) == true) {
            System.out.println("id đã tồn tại");
        } else {
            System.out.println("Nhập tên nhân viên");
            String name = scanner.nextLine();
            System.out.println("Nhập CMND nhân viên");
            int identityCard = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập ngày tháng năm sinh nhân viên");
            String dateOfBirth = scanner.nextLine();
            System.out.println("Nhập giới tính nhân viên");
            String gender = scanner.nextLine();
            System.out.println("Nhập số điện thoại nhân viên");
            int phoneNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập email nhân viên");
            String email = scanner.nextLine();
            System.out.println("Nhập trình độ nhân viên");
            String level = scanner.nextLine();
            System.out.println("Nhập vị trí nhân viên");
            String position = scanner.nextLine();
            System.out.println("Nhập lương nhân viên");
            String salary = scanner.nextLine();
            Employee employee = new Employee(name, identityCard, dateOfBirth, gender, phoneNumber, email, id, level, position, salary);
            employeeRepository.add(PATH, employee);
        }
    }

    public static Boolean checkBoolean(int id) {
        List<Employee> employeeList = employeeRepository.getAll();
        for (Employee element : employeeList) {
            if (element.getIdEmploye() == id) {
                return true;
            }
        }
        return false;
    }
}

