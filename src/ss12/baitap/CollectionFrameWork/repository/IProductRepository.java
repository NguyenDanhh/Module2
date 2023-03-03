package ss12.baitap.CollectionFrameWork.repository;

import ss12.baitap.CollectionFrameWork.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getList();

    void findElement();

    void findElement(int id);

    void addProduct(Product product);

    void editProduct(int id);

    void deleteProduct(Product element);
}
