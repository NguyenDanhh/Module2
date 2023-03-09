package ss17.baitap.CollectionFrameWork.repository;

import ss17.baitap.CollectionFrameWork.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getList();

    void findElement();

    void findElement(int id);

    void addProduct(Product product);

    void editProduct(String id);

    void deleteProduct(Product element);
}
