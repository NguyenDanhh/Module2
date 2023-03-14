package CaseStudy.repository;

import CaseStudy.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    void add(String path ,Employee employee);
    List<Employee> getAll() ;
    void editEmployee(String path , List<String> employee);

}
