package CaseStudy.repository.impl;

import CaseStudy.common.ReadFile;
import CaseStudy.common.WriteFile;
import CaseStudy.model.Employee;
import CaseStudy.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {


    private static final String PATH = "src/CaseStudy/data/file_employee.csv";

    @Override
    public void add(String path, Employee employee) {
        String str = employee.toCSV();
        List<String> list = new ArrayList<>();
        list.add(str);
        WriteFile.write(path, list);
    }

    @Override
    public List<Employee> getAll() {
        List<String> list = ReadFile.read(PATH);
        List<Employee> employeeList = new ArrayList<>();
        for (String element : list) {
            String[] array = element.split(",");
            Employee employee = new Employee(array[0], Integer.parseInt(array[1]), array[2],
                    array[3], Integer.parseInt(array[4]), array[5],
                    Integer.parseInt(array[6]), array[7], array[8], array[9]);
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void editEmployee(String path , List<String> list) {
        WriteFile.write(path, list);
    }

}



