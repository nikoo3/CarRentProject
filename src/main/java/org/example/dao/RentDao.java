package org.example.dao;

import org.example.datebase.SessionProvider;
import org.example.model.Rent;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class RentDao extends AbstractDao<Rent> {

    public RentDao() { super(Rent.class); }

    public void updateDayOfReturn(Rent rent , String dayOfReturn) {
        Session session = SessionProvider.getSession();
        Transaction transaction = session.beginTransaction();
        rent.setDayOfReturn(dayOfReturn);
        session.update(rent);
        transaction.commit();
        session.close();
    }
}
