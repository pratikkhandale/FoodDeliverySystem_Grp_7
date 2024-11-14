package com.bits.controller;

import com.bits.entity.Customer;
import com.bits.entity.CustomerLogin;
import com.bits.entity.Order;
import com.bits.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/register")
    public ResponseEntity<Customer> registerCustomer(@RequestBody @Valid Customer customer) {
        return ResponseEntity.ok(customerService.saveCustomer(customer));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }

    @GetMapping("/login")
    public ResponseEntity<String> customerLogin(@RequestBody CustomerLogin customerLogin) {
        return ResponseEntity.ok(customerService.login(customerLogin));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.updateCustomer(id, customer));
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getCustomerOrders(@RequestParam Long customerId) {
        return ResponseEntity.ok(customerService.getCustomerOrders(customerId));
    }
}
