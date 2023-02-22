package ss5.baitap.BuildClassWriteInJava;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.toString());
        student.setName("Jack");
        student.setClasses("C12");
        System.out.println(student.toString());
    }
}
