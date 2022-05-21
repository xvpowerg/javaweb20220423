package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns= {"/page1"},loadOnStartup = 3)
public class Page1Servelt extends HttpServlet{
	
	
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("page1 Init....");
		try {
			TimeUnit.SECONDS.sleep(5);			
		}catch(Exception ex) {
			
		}
		System.out.println("page1 Init  Finish....");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("Page1!");
	}
}
