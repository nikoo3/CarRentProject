package org.example;

import org.example.dao.CarDao;
import org.example.dao.CustomerDao;
import org.example.dao.RentalDao;
import org.example.model.Car;
import org.example.model.Customer;
import org.example.model.Rental;

public class App {
    public static void main( String[] args ) {

        CarDao carDao = new CarDao();
        CustomerDao customerDao = new CustomerDao();
        RentalDao rentalDao = new RentalDao();

        Car octavia = new Car("Skoda","Octavia","SZ 012345","green","good","none damages");
        Customer bartek2 = new Customer("Bartek","Osiak");
        Rental firstRental = new Rental(octavia,bartek2,"12.04.2020","20.04.2021");

//        customerDao.add(bartek2);
        carDao.delete(carDao.findById(2));
        carDao.delete(carDao.findById(3));
        rentalDao.add(firstRental);


        System.out.println( "Hello World!" );
    }
}
