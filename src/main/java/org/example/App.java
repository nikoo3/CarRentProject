package org.example;

import org.example.dao.CarDao;
import org.example.dao.ClientDao;
import org.example.dao.RentDao;

public class App {
    public static void main( String[] args ) {

        CarDao carDao = new CarDao();
        ClientDao  clientDao = new ClientDao();
        RentDao rentDao = new RentDao();

//        Car octavia = new Car("Skoda","Octavia","SZ 012345","green","good","none damages");
//        Client bartek2 = new Client("Bartek","Osiak");
//
//        clientDao.add(bartek2);
//        carDao.add(octavia);
//
//        Rent firstRent = new Rent(octavia,bartek2,"12.04.2020","20.04.2021");
//        rentDao.add(firstRent);



//        System.out.println( "Hello World!" );
    }
}
