package ss10.baitap.StudentManagement.Repository;

import ss10.baitap.StudentManagement.Model.Students;

import java.util.List;

public interface IStudentRepository {
    List<Students> getAll();

    void addStudent(Students students);
    void deleteStudent(int i) ;
}
