package org.example.dao;

import org.example.model.Customer;


public class CustomerDao extends AbstractDao<Customer>{

    public CustomerDao(){
        super(Customer.class);
    }
}
