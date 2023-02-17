package ss2.baitap;

public class InCacLoaiHinh {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }

}
