package ss17.baitap.ProductManager.controller;

import ss17.baitap.ProductManager.service.IProducService;
import ss17.baitap.ProductManager.service.ProductService;

import java.util.Scanner;

public class ProductController {
    IProducService iProducService = new ProductService();

    public void menuProduct() {

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Các chức năng : \n" + "1.Thêm sản phầm \n" +
                    "2.Hiển thị danh sách sản phầm \n" + "3.Tìm kiếm sản phẩm \n"+
                    "4.Thoát : \n" + "Mời chọn");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProducService.addProduct();
                    break;
                case 2:
                    iProducService.displayAll();
                    break;
                case 3:
                    iProducService.find();
                    break;
            }
        } while (choice > 0 && choice < 4);

    }
}
