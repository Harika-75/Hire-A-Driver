package com.tmf.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("This is a do get Test Servlet");
		String op=request.getParameter("op");
		int result=0;
		
		if(null!=op&&op.equals("addition")) {
			result=Integer.parseInt(request.getParameter("num1"))+Integer.parseInt(request.getParameter("num2"));
			System.out.println(result);
		}else if(null!=op&&op.equals("subtract")) {
			result=Integer.parseInt(request.getParameter("num1"))-Integer.parseInt(request.getParameter("num2"));
			System.out.println(result);
		}
		else if(null!=op&&op.equals("multiply")) {
			result=Integer.parseInt(request.getParameter("num1"))*Integer.parseInt(request.getParameter("num2"));
			System.out.println(result);
		}
		else if(null!=op&&op.equals("divide")) {
			try {
			result=Integer.parseInt(request.getParameter("num1"))/Integer.parseInt(request.getParameter("num2"));
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("divided by zero not possible");
		}
		}
		else 
		{
			System.out.println(request.getParameter("num1"));
			System.out.println(request.getParameter("num2"));
		}
		response.getWriter().append("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<h1>Welcome to Hire A Driver</h1>\r\n"
				+ "\r\n"
				+ "<form action=\"http://localhost:8082/HireADriver/TestServlet\"method=\"get\">\r\n"
				+"    Num1:<input name=\"num1\" type=\"text\" value="+ request.getParameter("num1") +">\r\n"
				+ "    Num2:<input name=\"num2\" type=\"text\" value="+request.getParameter("num2")+">"
				+ "  \r\n"
				+ "    <label for=\"op\">Operation:</label>\r\n"
				+ "    <select name=\"op\" id=\"op\">\r\n"
				+ "    	<option value=\"select\"></option>\r\n"
				+ "        <option value=\"addition\">Addition</option>\r\n"
				+ "        <option value=\"subtract\">Subtract</option>\r\n"
				+ "        <option value=\"multiply\">Multiply</option>\r\n"
				+ "        <option value=\"divide\">Divide</option>\r\n"
				+ "        </select>\r\n"
				+ "        \r\n"
				+ "    <input type=\"submit\"/>\r\n"
				+ "    </form>\r\n"
				+"<h2> Result is:"+result+"</h2>"
				+ "</body>\r\n"
				+ "</html>");
	}
	}


