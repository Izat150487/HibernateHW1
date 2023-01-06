package com.peaksoft.util;

import com.peaksoft.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {

    private static final SessionFactory session = buildSession();

    private static SessionFactory buildSession(){
        try {
            return new Configuration().configure()
                    .addAnnotatedClass(Company.class)
                    .addAnnotatedClass(Course.class)
                    .addAnnotatedClass(Group.class)
                    .addAnnotatedClass(Employee.class)
                    .addAnnotatedClass(Contact.class)
                    .addAnnotatedClass(Passport.class)
                    .addAnnotatedClass(Sport.class)
                    .addAnnotatedClass(Teacher.class)
                    .addAnnotatedClass(Trainer.class)
                    .addAnnotatedClass(User.class)
                    .buildSessionFactory();


        }catch (Throwable e){
            System.out.println("Session is not open");
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSession(){
        return  session;
    }

    public static void shutdown(){

    }
}
