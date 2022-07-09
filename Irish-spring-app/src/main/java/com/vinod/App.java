package com.vinod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	Detail detail = ac.getBean("dt", Detail.class);
    	
    	detail.hello();
    }
}