package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.CustomerService;
import service.CustomerServiceImpl;

/**
 * Servlet implementation class SignIn
 */
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		String name=request.getParameter("uname");
		String password=request.getParameter("pwd");
		CustomerService customer=new CustomerServiceImpl();

		try {
			if(customer.logingIn(name, password)) {
				response.sendRedirect("./main.jsp");
			}
			else {
				response.sendRedirect("./logininfailed.jsp");
			}
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
