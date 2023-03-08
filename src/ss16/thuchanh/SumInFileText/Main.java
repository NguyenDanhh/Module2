package ss16.thuchanh.SumInFileText;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "CodeGymDaNang";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.toUpperCase());
        }
        for (int i = 0; i < list.size(); i++) {
        }
    }
    public static List<String> solution(String s) {
        List<String> list = new ArrayList<>();
            list.add(s);
        for (String element: list) {
            element.toLowerCase();
        }
        return list;
    }
}
