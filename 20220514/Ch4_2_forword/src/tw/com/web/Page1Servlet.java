package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =  resp.getWriter();
		String act = req.getParameter("act");
		String pwd =  req.getParameter("pwd");
	
		if (act.equals("root") && pwd.equals("123456")) {
			req.getRequestDispatcher("/page2").forward(req, resp);
		}else {
			req.getRequestDispatcher("/page3").forward(req, resp);
		}
		
	}
}
