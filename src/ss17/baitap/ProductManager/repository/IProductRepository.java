package ss17.baitap.ProductManager.repository;

import ss17.baitap.ProductManager.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getList();

    void addProduct(String path, List<Product> list);
    List<Product> findProduct(int id );
}
