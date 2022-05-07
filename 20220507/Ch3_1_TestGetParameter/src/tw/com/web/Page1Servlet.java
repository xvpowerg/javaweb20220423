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
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String value = req.getParameter("info");
		 PrintWriter out =  resp.getWriter();
		 String jobName = "µL";
		 switch(value.toLowerCase()) {
		 case "ken":
			 jobName="Manager";
			 break;
		 case "vivin":
			 jobName="PM";
			 break;	
		 case "lucy":
			 jobName="RD";
			 break;
		 default:
			 jobName="Error";
			 break;	 
		 }
		 out.println("<html>");
		 out.println("<body>");
		 out.println("<h3>");
		 out.println(jobName);
		 out.println("</h3>");
		 out.print("</body>");
		 out.println("</html>");
		 
		
	}
}
