package org.example;

import org.example.dao.CarDao;
import org.example.dao.ClientDao;
import org.example.model.Car;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        CarDao carDao = new CarDao();
        ClientDao  clientDao = new ClientDao();

        Car octavia = new Car("Skoda","Octavia","zielony","sprawny");
        carDao.add(octavia);

        System.out.println( "Hello World!" );
    }
}
