package com.peaksoft;

import com.peaksoft.entity.*;
import com.peaksoft.util.Util;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Company company = new Company();
        company.setName("Google");
        company.setLocatedCountry("USA");
        create(company);

        Course course = new Course();
        course.setName("2-course");
        create(course);

        Group group = new Group();
        group.setName("Java 4");
        create(group);

        Employee employee = new Employee();
        employee.setName("Elzat");
        employee.setAge(27);
        create(employee);

        Contact contact = new Contact();
        contact.setAddress("Telmana 54");
        contact.setPhoneNumber(+791178344);
        create(contact);

        Passport passport = new Passport();
        passport.setINN("AS126346");
        create(passport);

        Sport sport = new Sport();
        sport.setName("Football");
        create(sport);

        Teacher teacher = new Teacher();
        teacher.setName("Nurperi");
        teacher.setLastName("Arzymatova");
        teacher.setAge(18);
        create(teacher);

        Trainer trainer = new Trainer();
        trainer.setName("Balancha");
        create(trainer);

    }

    public static Long create (Company c){
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
        session.close();
        return c.getId();
    }

    public static Long create(Course c1){
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.save(c1);
        session.getTransaction().commit();
        session.close();
        return c1.getId();
    }

    public static Long create(Group g){
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.save(g);
        session.getTransaction().commit();
        session.close();
        return g.getId();
    }

    public static Long create(Employee e){
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
        session.close();
        return e.getId();
    }

    public static Long create(Contact c2){
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.save(c2);
        session.getTransaction().commit();
        session.close();
        return c2.getId();
    }

    public static Long create(Passport p){
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        session.close();
        return p.getId();
    }

    public static Long create(Sport s){
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.save(s);
        session.getTransaction().commit();
        session.close();
        return s.getId();
    }

    public static Long create(Teacher t){
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        session.close();
        return t.getId();
    }

    public static Long create(Trainer t1){
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.save(t1);
        session.getTransaction().commit();
        session.close();
        return t1.getId();
    }
}
