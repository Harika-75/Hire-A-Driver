package com.tmf.had.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.tmf.had.util.DBConnection;

/**
 * Servlet implementation class DriverStatusServlet
 */
@WebServlet("/DriverStatusServlet")
public class DriverStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DriverStatusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String status = request.getParameter("status");

        try {

            Connection conn = DBConnection.getConnection();

            String sql =
                    "UPDATE drivers SET availability_status=? WHERE driver_id=1";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, status);
            ps.executeUpdate();
            response.sendRedirect("driver_dashboard.html");

        } catch (Exception e) {

            e.printStackTrace();

        }
	}

}
