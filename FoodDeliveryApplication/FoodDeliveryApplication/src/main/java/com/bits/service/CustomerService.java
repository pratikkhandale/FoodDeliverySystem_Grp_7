package com.bits.service;

import com.bits.entity.Customer;
import com.bits.entity.Order;
import com.bits.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    public Customer updateCustomer(Long id, Customer customer) {
        Customer customerPresent = getCustomerById(id);
        if (null != customerPresent) {
            customerRepository.save(customer);
        }
        return customer;
    }

    public List<Order> getCustomerOrders(Long customerId) {
        Customer customer = getCustomerById(customerId);
        return customer.getOrders();
    }
}
