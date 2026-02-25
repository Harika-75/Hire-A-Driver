package com.tmf.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.tmf.entity.User;

/**
 * Servlet implementation class UserHomeServlet
 */
@WebServlet("/UserHomeServlet")
public class UserHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserHomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		 if (session == null) {
		        response.sendRedirect("login.html");
		        return;
		    }
		
		User user = (User)session.getAttribute("loggedinUser");
		
		// TODO Auto-generated method stub
		response.getWriter().append("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>User Home Page</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<h1>Welcome to User Home</h1>\r\n"
				+ user.getUserName() + "<br/>"
				+ user.getEmail() + "<br/>"
				+ user.getContactNo() + "<br/>"
				+ "	<form action=\"LogoutServlet\" method=\"post\">\r\n"
				+ "	<input type=\"submit\" value=\"Logout\"/>\r\n"
				+ "	</form>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
