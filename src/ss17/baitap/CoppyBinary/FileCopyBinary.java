package ss17.baitap.CoppyBinary;

import java.io.*;

public class FileCopyBinary {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("src/ss17/baitap/CoppyBinary/source_file.csv");
            OutputStream outputStream = new FileOutputStream("ss17/baitap/CoppyBinary/target_file.csv"){
                
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
