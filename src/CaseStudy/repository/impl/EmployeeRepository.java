package CaseStudy.repository.impl;

import CaseStudy.common.Reader;
import CaseStudy.common.WriteFile;
import CaseStudy.model.Employee;
import ss17.baitap.ProductManager.common.ReadFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    public void add(Employee employee) {
        String str = toCSV(employee);
        List<String> stringList = new ArrayList<>();
        stringList.add(str);
        WriteFile.write("", stringList);
    }

    private static String toCSV(Employee employee) {
        return employee.getIdEmploye()+",";
    }
    public List<Employee> getAll() {
        List<String> stringList = Reader.readFile("");
        List<Employee> employees = new ArrayList<>();
        for(String str: stringList) {
            String[] temp = str.split(",");
            Employee employee = new Employee();
            employees.add(employee);
        }
        return employees;

    }
}
