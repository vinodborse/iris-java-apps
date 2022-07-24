package com.vinod;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vinod.model.Employee;
import com.vinod.model.Mobile;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class)
    														.addAnnotatedClass(Mobile.class);
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	session.beginTransaction();
    	//=======================
    	
    	Employee emp1 = new Employee();
    	
    	emp1.setName("Vinod");
    	emp1.setAddress("Pune");
    	
    	
    	Employee emp2 = new Employee();
    	
    	emp2.setName("Komal");
    	emp2.setAddress("Pune");
    	
    	Mobile m1 = new Mobile();
    	m1.setNum(1234);
    	
    	Mobile m2 = new Mobile();
    	m2.setNum(9876);

    	
    	ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
    	mobiles.add(m1);
    	mobiles.add(m2);
    	
    	
    	emp1.setMobile(mobiles);
    	emp2.setMobile(mobiles);
    	
    	session.save(emp1);
    	session.save(emp2);
    	session.save(m1);
    	session.save(m2);
    	//========================
    	session.getTransaction().commit();
    	session.close();

    }
}
