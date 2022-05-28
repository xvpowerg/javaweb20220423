package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String act  = req.getParameter("act");
		String pwd  =req.getParameter("pwd");
		PrintWriter out = resp.getWriter();
		if (act == null || pwd == null || 
		(act.equals("qwer") && pwd.equals("12345")) == false ) {
			out.print("fail");
		}else {
			out.print("success");
		}
	}
}
