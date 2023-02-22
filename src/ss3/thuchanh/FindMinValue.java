package ss3.thuchanh;

public class FindMinValue {
    public static void main(String[] args) {
        int[] array = {4, 12, 7, 8, 1, 6, 9};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là " + min);
    }
}
