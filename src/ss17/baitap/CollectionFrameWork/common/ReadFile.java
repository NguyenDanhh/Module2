package ss17.baitap.CollectionFrameWork.common;

import ss17.baitap.CollectionFrameWork.model.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Product> read(String path){
        List<Product> list = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = "";
            String[] array ;
            Product product;
            while ((line = bufferedReader.readLine()) != null){
                array = line.split(",");
                product = new Product(array[0] , array[1], array[2] , array[3]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
