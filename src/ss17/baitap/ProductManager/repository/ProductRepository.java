package ss17.baitap.ProductManager.repository;

import ss17.baitap.ProductManager.common.ReadFile;
import ss17.baitap.ProductManager.common.WriteFile;
import ss17.baitap.ProductManager.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public static final String PATH = "src/ss17/baitap/ProductManager/data/file.txt";
    public List<Product> getList() {
        return ReadFile.read(PATH);
    }
    @Override
    public void addProduct(String path, List<Product> list) {
        WriteFile.write(path , list);
    }

    @Override
    public List<Product> findProduct(int id) {
        List<Product> products = ReadFile.read(PATH);
        List<Product> listProduct = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == id){
                listProduct.add(products.get(i));
            }
        }
        return listProduct;
    }


}
