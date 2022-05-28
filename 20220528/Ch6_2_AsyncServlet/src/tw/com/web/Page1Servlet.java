package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	private ExecutorService es;
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		es = Executors.newCachedThreadPool();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out = resp.getWriter();
	out.print("Page1 Start!..."+Thread.currentThread().getName());
	
	es.execute(()->{
			try {
				TimeUnit.SECONDS.sleep(5);	
			}catch(Exception ex) {
				
			}
			System.out.println("Complete!");
			//out.println("Complete out!");
	});


	
	out.print("Page1 End!..."+Thread.currentThread().getName());
	}
}
