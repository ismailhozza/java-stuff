package com.tijaabo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloWorldServletRaw extends HttpServlet {

	public void init() {
		System.out.println("HelloWorldServlet init code here!");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException {
		System.out.println("hello doGet()");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Hello World");
	}
}