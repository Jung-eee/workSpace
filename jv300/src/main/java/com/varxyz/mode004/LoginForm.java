package com.varxyz.mode004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/mode005/login.do")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String DEFAULT_NAME ="world";   
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		String userName = request.getParameter("userName");
		String ssn = request.getParameter("ssn");
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String concern = request.getParameter("concerns");
		String[]concerns = request.getParameterValues("concerns");
		
		
		String pageTitle = "Hello world";
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>");
		out.println("<body>");
		out.println("<p>" + userId +"</p>");
		out.println("<p>" + passwd +"</p>");
		out.println("<p>" + userName +"</p>");
		out.println("<p>" + ssn +"</p>");
		out.println("<p>" + email1 +"</p>");
		out.println("<p>" + email2 +"</p>");
		out.println("<p>" + concern +"</p>");
		out.println("</body></html>");
		out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
