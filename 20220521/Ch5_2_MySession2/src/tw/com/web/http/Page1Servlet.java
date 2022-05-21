package tw.com.web.http;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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
			PrintWriter out =   resp.getWriter();
			ArrayList<String> list = new ArrayList();
			list.add("Ken");
			list.add("Lucy");
			list.add("Iris");
			MyHttpSession session = 
					WebTools.getMyHttpSession(req, resp);
			session.setAttribute("names", list);
			out.println("Page1");
		}
}

