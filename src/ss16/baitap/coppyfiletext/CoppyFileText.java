package ss16.baitap.coppyfiletext;

import java.io.*;

public class CoppyFileText {
    public static void main(String[] args) {
        int count = 0 ;
        try {
            FileReader fileReader = new FileReader("src/ss16/baitap/coppyfiletext/SourceFile.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                for (int i = 0; i < line.length(); i++) {
                    if(line.charAt(i) != ' '){
                        count++;
                    }
                }
                try{
                    FileWriter fileWriter = new FileWriter("src/ss16/baitap/coppyfiletext/TargetFile" , true) ;
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Có " + count + " ký tự trong tệp");
    }
}
