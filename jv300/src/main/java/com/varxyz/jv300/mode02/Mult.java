package com.varxyz.jv300.mode02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Mult extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		getServletConfig();
		String pageTitle = "Hello world";
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>");
		out.println("<body>");
		out.println("<h3>구구단</h3>");
		for (int i = 2; i < 10; i++) {
			out.println("<p>");
			for (int j = 1; j < 10; j++) {
				out.print(i +" x "+ j +" = "+ i*j + "\t");
			}
			out.println("</p>");
		}
		out.println("</body></html>");
		out.close();

	}
}
