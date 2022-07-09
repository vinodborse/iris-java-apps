package com.vinod.bean.work;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		 
    	Detail detail = ac.getBean("vinu", Detail.class);
    	
//    	Student student = ac.getBean("student", Student.class);
    	
//    	detail.setStudent(student);
    	
    	//Student st1 = new Student(1, "Komal", "Patel");
    	
    	
    	detail.studentDetail();
    }
}