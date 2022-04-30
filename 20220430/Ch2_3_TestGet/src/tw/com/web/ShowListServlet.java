package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/show_list")
public class ShowListServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out =  resp.getWriter();
		 out.println("<html>");
		 out.println("<body>");
		 	out.println("<ul>");
		 		
		 	for (int i = 1; i <= 5;i++) {
		 	    out.println("<li>"); 
			 	out.println("value!!"+i);
			 	out.println("</li>");	
		 	}
		 	
		 	    
		 	out.println("</ul>");
		 out.println("</body>");		 
		 out.println("</html>");
	}
}
