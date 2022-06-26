package com.vinod;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sample")
public class Sample extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String name = request.getParameter("userName");
		String password = request.getParameter("pwd");
		
		request.setAttribute("userName", name+" FROM GET");
		request.setAttribute("password", password+" FROM GET");
		
		RequestDispatcher rq = request.getRequestDispatcher("data.jsp");
		rq.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String name = request.getParameter("userName");
		String password = request.getParameter("pwd");
		
		request.setAttribute("userName", name+" FROM POST");
		request.setAttribute("password", password+" FROM POST");
		
		RequestDispatcher rq = request.getRequestDispatcher("data.jsp");
		rq.forward(request, response);
		
	}
	
}
