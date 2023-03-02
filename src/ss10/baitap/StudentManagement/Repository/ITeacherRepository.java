package ss10.baitap.StudentManagement.Repository;

import ss10.baitap.StudentManagement.Model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getAll();

    void addTeacher(Teacher teacher);

    void deleteTeacher(int removeID);
}
