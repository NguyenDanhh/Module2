package ss17.baitap.ProductManager.repository;

import ss17.baitap.ProductManager.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productsList = new ArrayList<>();


    public List<Product> getList() {
        return productsList;
    }

    @Override
    public void findElement() {
    }

    @Override
    public void findElement(int id) {

    }


    @Override
    public void addProduct(Product product) {
        productsList.add(product);
    }

    @Override
    public void editProduct( String id ) {
        productsList.contains(id);

    }

    @Override
    public void deleteProduct(Product element) {
        productsList.remove(element);
    }


}
