package CaseStudy.repository.Person.impl;

import CaseStudy.common.ReadFile;
import CaseStudy.common.WriteFile;
import CaseStudy.model.Customer;
import CaseStudy.repository.Person.ICustomerRepository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String PATH = "src/CaseStudy/data/file_customer.csv";
    @Override
    public void add(String path, Customer customer) {
        String str = customer.toCSV();
        List<String> list = new LinkedList<>();
        list.add(str);
        WriteFile.write(path, list);
    }

    @Override
    public List<Customer> getAll() {
        List<String> list = ReadFile.read(PATH);
        List<Customer> customerList = new LinkedList<>();
        for (String element : list) {
            String[] array = element.split(",");
            Customer customer = new Customer(array[0], Integer.parseInt(array[1]), array[2],
                    array[3], Integer.parseInt(array[4]), array[5],
                    Integer.parseInt(array[6]), array[7], array[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    public void editCustomer(int i, Customer customer, List<Customer> list) {
        List<String> list1 = new ArrayList<>();
        String str = customer.toCSV();
        list.set(i, customer);
        list1.add(str);
        WriteFile.write(PATH, list1);
    }

}
