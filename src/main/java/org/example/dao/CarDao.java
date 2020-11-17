package org.example.dao;

import org.example.datebase.SessionProvider;
import org.example.model.Car;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CarDao extends AbstractDao<Car>{

    public CarDao(){
        super(Car.class);
    }

    public void updateDamages(Car car , String descriptions) {
        Session session = SessionProvider.getSession();
        Transaction transaction = session.beginTransaction();
        car.setDescOfTheDamage(descriptions);
        session.update(car);
        transaction.commit();
        session.close();
    }
}
