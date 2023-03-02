package ss12.baitap.CollectionFrameWork.repository;

import ss12.baitap.CollectionFrameWork.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productsList = new ArrayList<>();

    static {
        productsList.add(new Product(1, "Bóng rổ ", " 1/1/1", "orange"));
        productsList.add(new Product(2, "Bóng rổ ", " 1/1/1", "blue"));
    }

    public List<Product> getList() {
        return productsList;
    }

    @Override
    public void findElement() {

    }

    @Override
    public void addProduct(Product product) {
        productsList.add(product);
    }

    @Override
    public void editProduct(int id) {
    }

    @Override
    public void deleteProduct(Product element) {
        productsList.remove(element);
    }


}
