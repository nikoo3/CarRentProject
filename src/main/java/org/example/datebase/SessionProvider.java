package org.example.datebase;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SessionProvider {

    public static SessionProvider(){};

    public static Session getSession() {
        return new Configuration().configure().buildSessionFactory().openSession();
    }
}
