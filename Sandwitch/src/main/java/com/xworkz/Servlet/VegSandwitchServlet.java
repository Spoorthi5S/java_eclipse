package com.xworkz.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/veg")
public class VegSandwitchServlet extends HttpServlet {
	
	public VegSandwitchServlet() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	@Override
	public void init() throws ServletException {
		System.out.println("running veg init..");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running dopost of Veg....");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String comments=req.getParameter("comments");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(comments);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if(name.length()>3 && email.length()>3 && comments.length()>3) {
			writer.print("<span style='color:purple'>");
			writer.print("Sign up succesfully");
			writer.print("</span>");
		}else {
			writer.print("<span style='color:pink'>");
			writer.print("change the contact...");
			writer.print("</span>");
		}
		writer.print("</h1>");
		writer.print("<a href=\"index.html\">Home Page</a>");
		writer.print("<br>");
		writer.print("<a href=\"contact.html\">contact Page</a>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
	

}
