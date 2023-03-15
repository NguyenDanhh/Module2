package CaseStudy.repository.Person;

import CaseStudy.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    void add(String path ,Employee employee);
    List<Employee> getAll() ;
    void editEmployee(int i , Employee employee , List<Employee> list);

}
