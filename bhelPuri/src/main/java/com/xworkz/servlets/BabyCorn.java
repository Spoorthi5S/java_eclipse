package com.xworkz.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/call")
public class BabyCorn extends HttpServlet{
	
	public BabyCorn() {
		System.out.println("created "+getClass().getSimpleName());
		}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet of BabyCorn");
	}

}
