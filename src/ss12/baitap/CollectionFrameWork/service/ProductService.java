package ss12.baitap.CollectionFrameWork.service;

import ss12.baitap.CollectionFrameWork.model.Product;
import ss12.baitap.CollectionFrameWork.repository.IProductRepository;
import ss12.baitap.CollectionFrameWork.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProducService {
    IProductRepository iProductRepository = new ProductRepository();
    @Override
    public void displayAll() {
        List<Product> list = iProductRepository.getList();
        for (Product product : list) {
            System.out.println(product);
        }
    }

    @Override
    public void findElement() {
        List<Product> list = iProductRepository.getList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product elemnet : list) {
            if (elemnet.getId() == id) {
                System.out.println(elemnet);
            } else {
                System.out.println("Phần tử không có trong mảng ");
            }
            return;
        }
    }

    @Override
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(" Nhập tên sản phẩm : ");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập ngày sản xuất ");
        String dateOfManufacture = scanner.nextLine();
        System.out.println("Nhập màu");
        String color = scanner.nextLine();
        Product product = new Product(id, nameProduct, dateOfManufacture, color);
        iProductRepository.addProduct(product);
        System.out.println("Thêm thành công !");
    }

    @Override
    public void editProduct() {
        List<Product> list = iProductRepository.getList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào id muốn chỉnh sửa : ");
        int id = Integer.parseInt(scanner.nextLine());
        iProductRepository.editProduct(id);
        for (Product elemnt : list) {
            if (elemnt.getId() == id) {
                System.out.println("Mời nhập tên sản phầm cần chỉnh sửa ");
                String nameProduct = scanner.nextLine();
                elemnt.setNameProduct(nameProduct);
                System.out.println("Mời nhập ngày xuất bản cần chỉnh sửa ");
                String dateOfManufacture = scanner.nextLine();
                elemnt.setDateOfManufacture(dateOfManufacture);
                System.out.println("Mời nhập màu cần chỉnh sửa ");
                String color = scanner.nextLine();
                elemnt.setColor(color);
                System.out.println("Chỉnh sửa thành công !");
                return;
            }

        }
        System.out.println("Không tồn tại ");
    }

    @Override
    public void deleteProduct() {
        List<Product> list = iProductRepository.getList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần xóa :");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product element : list) {
            if (element.getId() == id) {
                System.out.println("Bạn có chắc muốn xóa hay không \n" +
                        "1. Có " + "2. Không ");
                int number = Integer.parseInt(scanner.nextLine());
                if (number == 1) {
                    iProductRepository.deleteProduct(element);
                    System.out.println("Xóa thành công ");
                }
            }
            return;
        }
        System.out.println("Phần tử không tồn tại");
    }
}
