package com.bits.repository;

import com.bits.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {


    /**
     * Finds all orders associated with the given customer ID.
     *
     * @param customerId the ID of the customer
     * @return a list of orders for the specified customer
     */
    List<Order> findByCustomer_Id(Long customerId);
}
