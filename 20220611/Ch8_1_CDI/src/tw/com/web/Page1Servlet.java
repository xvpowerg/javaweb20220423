package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.bean.Fruit;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	private static final String MY_FRUIT = "myFruit";
	private static final String MY_FRUIT2 = "myFruit2";
	//Inject 只可以是屬性
		@Inject
		@Named(MY_FRUIT)
		private Fruit fruit1;
		
		@Inject
		@Named(MY_FRUIT2)
		private Fruit fruit2;
		@Override
		protected void doGet(HttpServletRequest req, 
				HttpServletResponse resp) 
				throws ServletException, IOException {
			// TODO Auto-generated method stub
		PrintWriter out = 	resp.getWriter();
		out.println("Page1");
		out.println("Fruit1:"+fruit1);
		out.println("Fruit2:"+fruit2);
		
		}
}
