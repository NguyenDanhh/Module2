package ss5.thuhanh.StaticMethod;

public class Student {
    private int age;
    private String name;
    private static String college = "BBDIT";

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    static void change() {
        college = "CodeGym";
    }

    void display() {
        System.out.println("Student {name :  " + name + " age = " + age + " college : " + college);
    }
}
