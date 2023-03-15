package CaseStudy.repository.Person;

import CaseStudy.model.Customer;
import CaseStudy.model.Employee;

import java.util.List;

public interface ICustomerRepository {
    void add(String path , Customer customer);
    List<Customer> getAll() ;
    void editCustomer(int i, Customer customer, List<Customer> list);
}
