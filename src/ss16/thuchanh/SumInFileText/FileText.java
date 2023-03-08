package ss16.thuchanh.SumInFileText;

import java.io.*;

public class FileText {
    public static void main(String[] args) {
        String str = "Nguyễn văn a";
        try {
            FileWriter fileWriter = new FileWriter("src/ss16/thuchanh/SumInFileText/FileWriter.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(str);
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/ss16/thuchanh/SumInFileText/FileWriter.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
