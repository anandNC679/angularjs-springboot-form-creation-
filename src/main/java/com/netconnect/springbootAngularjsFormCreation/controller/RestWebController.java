package com.netconnect.springbootAngularjsFormCreation.controller;

/**
 * author anand.
 * since on 24/5/18.
 */
import java.util.ArrayList;
import java.util.List;

import com.netconnect.springbootAngularjsFormCreation.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/customer")
public class RestWebController {

    List<Customer> cust = new ArrayList<Customer>();

    @GetMapping(value = "/all")
    public List<Customer> getResource(){
        return cust;
    }

    @PostMapping(value="/save")
    public String postCustomer(@RequestBody List<Customer> customers){
        cust.addAll(customers);
        return "Post Successfully!";
    }
}