package org.example.dao;

import org.example.datebase.SessionProvider;
import org.example.model.Rental;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class RentalDao extends AbstractDao<Rental> {

    public RentalDao() { super(Rental.class); }

    public void updateDayOfReturn(Rental rental, String dayOfReturn) {
        Session session = SessionProvider.getSession();
        Transaction transaction = session.beginTransaction();
        rental.setDayOfReturn(dayOfReturn);
        session.update(rental);
        transaction.commit();
        session.close();
    }
}
