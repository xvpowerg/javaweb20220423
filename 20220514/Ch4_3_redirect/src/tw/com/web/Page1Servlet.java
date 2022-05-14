package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
			
			String p = req.getParameter("p");
			String toPage = "";
			switch(p) {
			case "home":
				toPage = "index.html";
				break;
			case "login":
				toPage = "login.html";
				break;
			case "shop_car":
				toPage = "shop_car.html";
				break;
			}
			resp.sendRedirect(toPage);
				
		}
}
