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
		//�Ĥ@��Servlet�~�|new
	     System.out.println("Page1Servlet:"+this.hashCode());	
	     //�L�k�I�s�j����Servlet����O
		 System.out.println("ServletContext:"+(this.getServletConfig() == null)) ;
	}
	
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
	     //�i�I�s�j����Servlet����O
   	 System.out.println("init ServletContext:"+(this.getServletContext() == null)) ;
    }
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			PrintWriter out =   resp.getWriter();
			out.println("Page1");
			//�C���A�ȬO���P������
			out.println("ThreadName:"+ Thread.currentThread().getName());
		}
}
