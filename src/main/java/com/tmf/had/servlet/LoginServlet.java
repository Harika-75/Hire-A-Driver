package com.tmf.had.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.tmf.had.dao.Userdao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "LoginServlets", urlPatterns = { "/LoginServlets" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        Userdao dao = new Userdao();
	        String role = dao.loginUser(email, password);
	        if (role != null) {
	            HttpSession session = request.getSession();
	            session.setAttribute("userEmail", email);
	            session.setAttribute("role", role);
	            if (role.equals("CUSTOMER")) {
	                response.sendRedirect("user_dashboard.html");
	            } else if (role.equals("DRIVER")) {
	                response.sendRedirect("driver_dashboard.html");
	            }
	        } else {
	            response.sendRedirect("login.html");
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
