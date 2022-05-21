package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet {
	private String pwd = "";
	private String account = "";
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		ServletContext context = 
				getServletContext();
		account = context.getInitParameter("db_account");
		pwd = context.getInitParameter("db_password");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out = resp.getWriter();
		 out.println(account+":"+pwd);
	}
}
