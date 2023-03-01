package ss10.baitap.StudentManagement.Repository.Implement;

import ss10.baitap.StudentManagement.Model.Students;
import ss10.baitap.StudentManagement.Repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Students> studentsList = new ArrayList<>();

    static {
        studentsList.add(new Students(123, "danh", "15/11/2003", true, "C1222G1", 9.0));
        studentsList.add(new Students(231, "huy", "15/1/2003", true, "C1222G1", 8.0));
        studentsList.add(new Students(132, "hưng", "5/11/2003", true, "C1222G1", 1.0));
    }

    public List<Students> getAll() {
        return studentsList;
    }

    @Override
    public void addStudent(Students students) {
        studentsList.add(students);
    }

    @Override
    public void deleteStudent(int removeID) {
        studentsList.remove(removeID);
    }


}
