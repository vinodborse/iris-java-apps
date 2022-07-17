package com.vinod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vinod.model.Employee;


public class App 
{
    public static void main( String[] args )
    {        
    	EmployeeOperations empOps = new EmployeeOperations();
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	session.beginTransaction();
    	
    	
    	// To Save
    	session.save(empOps.getEmployee());
    	
    	// To Get
    	// SELECT * FROM employee WHERE id = 3;
    	Employee empResult = session.get(Employee.class, 4);

    	//System.out.println(empResult);
    	
    	//empResult.setFirstName("Aarti");
    	
    	//To Update
    	// UPDATE employee SET firstName = 'aarti' WHERE (id = 4);
    	session.update(empResult);
    	
    	//System.out.println(session.get(Employee.class, 4));
    	
    	
    	//To Delete
    	//session.delete(empResult);

    	
    	session.getTransaction().commit();
    	session.close();
        
    }
}
