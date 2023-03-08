import java.util.ArrayList;
import java.util.List;

public class Main {
    public void main(String[] args) {
    String str = "CodeGymDaNang";
    System.out.println(solution(str));

}
    public List<Character> solution(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        return list;
    }


}