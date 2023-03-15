package CaseStudy.service.Person.impl;

import CaseStudy.model.Customer;
import CaseStudy.repository.Person.impl.CustomerRepository;
import CaseStudy.service.Person.ICustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static final String PATH = "src/CaseStudy/data/file_customer.csv";
    private static CustomerRepository customerRepository = new CustomerRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void editCustomer() {
        List<Customer> list = customerRepository.getAll();
        System.out.println("Nhập id cần chỉnh sửa ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdCustomer() == id) {
                Customer customer = new Customer();
                System.out.println("Nhập tên cần chỉnh sửa khách hàng ");
                String name = scanner.nextLine();
                customer.setName(name);
                System.out.println("Nhập CMND cần chỉnh sửa khách hàng ");
                int identityCard = Integer.parseInt(scanner.nextLine());
                customer.setIdentityCard(identityCard);
                System.out.println("Nhập ngày tháng năm sinh cần chỉnh sửa khách hàng");
                String dateOfBirth = scanner.nextLine();
                customer.setDateOfBirth(dateOfBirth);
                System.out.println("Nhập giới tính cần chỉnh sửa khách hàng");
                String gender = scanner.nextLine();
                customer.setGender(gender);
                System.out.println("Nhập số điện thoại cần chỉnh sửa khách hàng");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                customer.setPhoneNumber(phoneNumber);
                System.out.println("Nhập email cần chỉnh sửa khách hàng");
                String email = scanner.nextLine();
                customer.setEmail(email);
                System.out.println("Nhập loại khách hàng");
                String typeOfGuest = scanner.nextLine();
                customer.setTypeOfGuest(typeOfGuest);
                System.out.println("Nhập địa chỉ khách hàng");
                String address = scanner.nextLine();
                customer.setAddress(address);
                Customer customer1 = new Customer(name, identityCard, dateOfBirth, gender, phoneNumber, email, id, typeOfGuest, address);
                customerRepository.editCustomer(i, customer1, list);
                return;
            }
        }
        System.out.println("Id không tồn tại");
    }

    @Override
    public void display() {
        List<Customer> list = customerRepository.getAll();
        for (Customer element : list) {
            System.out.println(element);
        }
    }

    @Override
    public void add() {
        List<Customer> list = customerRepository.getAll();

        System.out.println("Nhập id khách hàng ");
        int id = Integer.parseInt(scanner.nextLine());
        if (checkBoolean(id) == true) {
            System.out.println("ID đã tồn tại");
        } else {
            System.out.println("Nhập tên khách hàng ");
            String name = scanner.nextLine();
            System.out.println("Nhập CMND khách hàng");
            int identityCard = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập ngày tháng năm sinh khách hàng");
            String dateOfBirth = scanner.nextLine();
            System.out.println("Nhập giới tính khách hàng");
            String gender = scanner.nextLine();
            System.out.println("Nhập số điện thoại khách hàng");
            int phoneNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập email khách hàng");
            String email = scanner.nextLine();
            System.out.println("Nhập loại khách hàng");
            String typeOfGuest = scanner.nextLine();
            System.out.println("Nhập địa chỉ khách hàng");
            String address = scanner.nextLine();
            Customer customer = new Customer(name, identityCard, dateOfBirth, gender, phoneNumber, email, id, typeOfGuest, address);
            customerRepository.add(PATH, customer);

        }
    }
    public static Boolean checkBoolean(int id ){
        List<Customer> customerList = customerRepository.getAll();
        for (Customer customer : customerList) {
            if(customer.getIdCustomer() == id ){
                return true;
            }
        }
        return false;
    }
}
