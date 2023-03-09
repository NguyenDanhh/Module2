package ss17.baitap.CoppyBinary;

import java.io.*;

public class FileCopyBinary {
    public static void main(String[] args) {
        String sourceFile = "src/ss17/baitap/CoppyBinary/source_file.csv";
        String targetFile = "src/ss17/baitap/CoppyBinary/target_file.csv";
        try {
            File file = new File(sourceFile);
            if (!file.exists()) {
                System.out.println("File source không tồn tại");
                return;
            }
            if (new File(targetFile).exists()) {
                System.out.println("File target đã tồn tại");
            }
            InputStream inputStream = new FileInputStream(sourceFile);
            OutputStream outputStream = new FileOutputStream(targetFile, true);
            byte[] buffer = new byte[1024];
            int length;

            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("Có " + file.length() * 2 + " byte trong mảng ");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
