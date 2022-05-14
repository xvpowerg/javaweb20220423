package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.LocalTime;

import javax.servlet.http.Cookie;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie cook1 = new Cookie("createTime", 
				LocalTime.now().toString());
		Cookie cook2 = new Cookie("createName","Ken");
		Cookie cook3 = new Cookie("testMsg",LocalTime.now().toString());
		//2 * 24 * 60 * 60  兩天
		cook3.setMaxAge(60*3); //單位秒
		resp.addCookie(cook1);
		resp.addCookie(cook2);
		resp.addCookie(cook3);
		
	}
}
