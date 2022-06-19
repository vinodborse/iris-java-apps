package com.vinod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) {
    	
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        
        String url = "jdbc:mysql://localhost:3306/iris_db";
        String username = "root";
        String password = "root";
        
        Connection connection;
		try {
			connection = DriverManager.getConnection(url, username, password);

	        Statement statement = connection.createStatement();
	        
	        //ResultSet rs = statement.executeQuery("SELECT * FROM employee WHERE first_name = 'Virat'");
	        
	        ResultSet rs = statement.executeQuery("SELECT * FROM employee");
	        
	        while(rs.next()) {
	        	
	        	Employee emp = new Employee();
	        	emp.setId(rs.getInt("id"));
	        	emp.setFirstName(rs.getString("first_name"));
	        	emp.setLastName(rs.getString("last_name"));
	        	
	        	System.out.println(emp);
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
