package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class SimpleServletProgram
 */
@WebServlet
(description = "Iam simple servlet", 
urlPatterns = { 
		"/SimpleServlet", 
		"/MYSimpleServletPath"
})
public class SimpleServletProgram extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
        // TODO Auto-generated constructor stub
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.println("Hello from Get methode:"+userName);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();
		String userName=request.getParameter("userName");
		String lastName=request.getParameter("lastName");
		String gender=request.getParameter("gender");
		String role=request.getParameter("role");
		String month=request.getParameter("month");
		String[] message = request.getParameterValues("message");
		
		out.println("Hello from post methode");
		out.println("FirstName :"+userName);
		out.println("LastName :"+lastName);
		out.println("Gender :"+ gender);
		out.println("Occupation:"+role);
		out.println("Dob :"+month);
		out.println("Message & Comment :" + message.length);
		
	}

}
