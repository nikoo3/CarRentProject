package org.example.dao;

import org.example.model.Customer;


public class ClientDao extends AbstractDao<Customer>{

    public ClientDao(){
        super(Customer.class);
    }
}
