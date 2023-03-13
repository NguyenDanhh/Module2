package ss17.baitap.ProductManager.service;

import ss17.baitap.ProductManager.model.Product;
import ss17.baitap.ProductManager.repository.IProductRepository;
import ss17.baitap.ProductManager.repository.ProductRepository;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProducService {
    public static final String PATH = "src/ss17/baitap/ProductManager/data/file.txt";
    IProductRepository iProductRepository = new ProductRepository();

    @Override
    public void displayAll() {
        List<Product> list = iProductRepository.getList();
        for (Product product : list) {
            System.out.println(product);
        }
    }


    @Override
    public void addProduct() {
        List<Product> list = iProductRepository.getList();
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
        list.add(product);
        iProductRepository.addProduct(PATH, list);
        System.out.println("Thêm thành công !");
    }

    @Override
    public void find() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm cần tìm ");
        int id = Integer.parseInt(scanner.nextLine());
        List<Product> list = iProductRepository.findProduct(id);
        if(list.isEmpty()){
            System.out.println("Không tồn tại");
        }else {
            System.out.println(list);
        }
    }
}
