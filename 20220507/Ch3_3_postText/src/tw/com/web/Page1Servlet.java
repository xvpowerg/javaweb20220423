package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");//輸出中文
		req.setCharacterEncoding("utf-8");//輸入編碼使用中文
		
		String name = req.getParameter("user_name");
		PrintWriter out =   resp.getWriter();
		out.println(name);
		System.out.println(name);
	}
}
