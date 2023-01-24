package com.xworkz.servlet.Vacation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/hotel")
public class OotyServlet extends HttpServlet{
	
	public OotyServlet() {
		System.out.println("created "+ getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget overriding");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doput...");
	}
	
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doTrace...");
	}
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doOptions..");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doDelete..");
	}
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doHead...");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ruuning doPost...");
		String data= "flowers, Mountain";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}

}
