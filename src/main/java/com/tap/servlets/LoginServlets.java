package com.tap.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlets() {
        super();
    }

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("DoPostMethod");
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		String email = request.getParameter("email");
		int salary = Integer.parseInt(request.getParameter("salary"));
		String dept = request.getParameter("dept");
		
		Employee e = new Employee(name,id,email,salary,dept);
		
		EmployeeBO employeeBO = new EmployeeBO();
		boolean save = employeeBO.save(e);
		
		PrintWriter writer = response.getWriter();
		
		if(save)
		{
			writer.println("Registration Successfull");
		}
		else
		{
			writer.println("Registration unsuccessfull");
		}
	}

}
