package com.production.controller;

import com.production.dto.OrderRequest;
import com.production.entity.Customer;
import com.production.repository.CustomerRepository;
import com.production.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepository cusRepo;

    @Autowired
    private ProductRepository proRepo;


    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest orderRequest) {
        return cusRepo.save(orderRequest.getCustomer());
    }

    @GetMapping("/checkOrder")
    public List<Customer> findAllOrder(){
        return cusRepo.findAll();
    }

}
