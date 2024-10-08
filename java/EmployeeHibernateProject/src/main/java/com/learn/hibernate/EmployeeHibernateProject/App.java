package com.learn.hibernate.EmployeeHibernateProject;

/**
 * Hello world!
 *
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//created configuration
        Configuration cfg = new Configuration();
        cfg.configure();
        //building session factory
        SessionFactory factory = cfg.buildSessionFactory();
//        System.out.println(factory);
//        System.out.println("Hibernate is working");
        
        //open session
        Session session = factory.openSession();
        
        //begin transaction
        Transaction tr = session.beginTransaction();
        
        //create student object
//        Employee e1 = new Employee(4, "Ritik", 94);
//        Employee e2 = new Employee(2, "Eshu", 94);
//        Employee e3 = new Employee(3, "Ro", 94);
        
        //saving student Object
//        session.save(e1);
//        session.save(e2);
//        session.save(e3);
        
        //commit changes
//        tr.commit();
        
        //fetching the employee data from db
        Employee e =  session.get(Employee.class, 1);
        
        //set the new data
        e.setEmpSalary(34254);
        session.save(e);
        tr.commit();
        System.out.println(e);
    }
}

