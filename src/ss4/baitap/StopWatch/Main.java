package ss4.baitap.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch rolex = new StopWatch();
        System.out.println(rolex.start());
        int a = 5 ;
        for (int i = 0; i < 100000L; i++) {
            System.out.println("hello world");
        }
        System.out.println(rolex.stop());
        System.out.println(rolex.getElapsedTime());

    }
}
