package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet {
	{
		//第一次Servlet才會new
	     System.out.println("Page1Servlet:"+this.hashCode());	
	     //無法呼叫大部分Servlet的能力
		 System.out.println("ServletContext:"+(this.getServletConfig() == null)) ;
	}
	
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
	     //可呼叫大部分Servlet的能力
   	 System.out.println("init ServletContext:"+(this.getServletContext() == null)) ;
    }
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			PrintWriter out =   resp.getWriter();
			out.println("Page1");
			//每次服務是不同執行續
			out.println("ThreadName:"+ Thread.currentThread().getName());
		}
}
