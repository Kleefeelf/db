package iot.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Hiber {
    private static SessionFactory ourSessionFactory;

    static {
        try {
            ourSessionFactory = new Configuration().configure().buildSessionFactory();
            System.out.println("Session initialized");
        } catch (Throwable ex) {
            System.err.println("SessionFactory init failed.");
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory() {
        return ourSessionFactory;
    }
    public static Session getSession() {
        return ourSessionFactory.openSession();
    }
}
