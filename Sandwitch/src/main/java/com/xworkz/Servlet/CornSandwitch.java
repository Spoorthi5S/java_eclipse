package com.xworkz.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/corn")
public class CornSandwitch extends HttpServlet {
	
	public CornSandwitch() {
	System.out.println("created "+this.getClass().getSimpleName());
	}
	@Override
	public void init() throws ServletException {
		System.out.println("running init method..");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost method..");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String startPoint=req.getParameter("startPoint");
		String endPoint=req.getParameter("destination");
		String gender=req.getParameter("laborGender");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(startPoint);
		System.out.println(endPoint);
		System.out.println(gender);

		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if(name.length()>3 && email.length()>3 && startPoint.length()>3 && endPoint.length()>3) {
			writer.print("<span style='color:blue'>");
			writer.print("Sign up succesfully");
			writer.print("</span>");
		}else {
			writer.print("<span style='color:red'>");
			writer.print("change the deliveryBoy");
			writer.print("</span>");
		}
		writer.print("</h1>");
		writer.print("<a href=\"index.html\">Home Page</a>");
		writer.print("<br>");
		writer.print("<a href=\"location.html\">location Page</a>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}

}
