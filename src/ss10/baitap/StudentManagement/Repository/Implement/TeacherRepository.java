package ss10.baitap.StudentManagement.Repository.Implement;

import ss10.baitap.StudentManagement.Model.Teacher;
import ss10.baitap.StudentManagement.Repository.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static List<Teacher> teachersList = new ArrayList<>();

    static {
        teachersList.add(new Teacher(123, "danh", "15/11/2003", true, "Toán"));
        teachersList.add(new Teacher(231, "huy", "15/1/2003", true, "Lý "));
        teachersList.add(new Teacher(132, "hưng", "5/11/2003", true, "Sử"));
    }

    public List<Teacher> getAll() {
        return teachersList;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teachersList.add(teacher);
    }

    @Override
    public void deleteTeacher(int removeID) {
        teachersList.remove(removeID);
    }


}
