package org.example;

import org.example.dao.CarDao;
import org.example.dao.CustomerDao;
import org.example.dao.RentDao;
import org.example.model.Car;
import org.example.model.Customer;
import org.example.model.Rent;

public class App {
    public static void main( String[] args ) {

        CarDao carDao = new CarDao();
        CustomerDao customerDao = new CustomerDao();
        RentDao rentDao = new RentDao();

        Car octavia = new Car("Skoda","Octavia","SZ 012345","green","good","none damages");
        Customer bartek2 = new Customer("Bartek","Osiak");

//



        System.out.println( "Hello World!" );
    }
}
