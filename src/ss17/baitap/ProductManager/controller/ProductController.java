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
                    "2.Sửa thông tin sản phẩm \n" + "3.Xóa sản phẩm \n" +
                    "4.Hiển thị danh sách sản phầm \n" +
                    "5.Tìm kiếm sản phầm \n" + "6.Sắp xếp sản phẩm \n" + "7.Thoát : \n" + "Mời chọn");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProducService.addProduct();
                    break;
                case 2:
                    iProducService.editProduct();
                    break;
                case 3:
                    iProducService.deleteProduct();
                    break;
                case 4:
                    iProducService.displayAll();
                    break;
                case 5:
                    iProducService.findElement();
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }
        } while (choice > 0 && choice < 7);

    }
}
