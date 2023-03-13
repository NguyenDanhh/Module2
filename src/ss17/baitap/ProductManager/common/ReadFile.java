package ss17.baitap.ProductManager.common;

import ss17.baitap.ProductManager.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Product> read(String path) {
        List<Product> list = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

}
