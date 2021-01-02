package study.spring.boot.example.springbootproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import study.spring.boot.example.springbootproject.dao.CustomerDAO;
import study.spring.boot.example.springbootproject.model.Customer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    private int customerIdCount = 1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer) {
        /*customer.setCustomerId(customerIdCount);
        customerList.add(customer);
        customerIdCount++;

        return customer;*/

        return customerDAO.save(customer);
    }

    public List<Customer> getCustomers() {
        //return customerList;

        return customerDAO.findAll();
    }

    public Customer getCustomer(int customerId) {
        /*return customerList
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();*/

        return customerDAO.findById(customerId).get();
    }

    public Customer updateCustomer(int customerId, Customer customer) {
        /*customerList
                .stream()
                .forEach(c -> {
                    if(c.getCustomerId() == customerId) {
                        c.setCustomerFirstName(customer.getCustomerFirstName());
                        c.setCustomerLastName(customer.getCustomerLastName());
                        c.setCustomerEmail(customer.getCustomerEmail());
                    }
                });

        return customerList
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();*/

        customer.setCustomerId(customerId);

        return customerDAO.save(customer);
    }

    public void deleteCustomer(int customerId) {
        /*customerList
                .stream()
                .forEach(c -> {
                    if(c.getCustomerId() == customerId) {
                        customerList.remove(c);
                    }
                });*/

        customerDAO.deleteById(customerId);
    }
}
