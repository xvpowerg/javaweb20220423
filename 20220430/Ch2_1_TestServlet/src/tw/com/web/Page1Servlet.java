package tw.com.web;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{

	//���� �@��w�]
	//�t�ק�!	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		//HttpServletRequest ��J
		//HttpServletResponse ��X
		 System.out.println("doGet!!!");
		 PrintWriter  out = resp.getWriter();
		 out.println("<html>");
		 out.println("<body>");
			 out.println("Hello!");
			 out.println("<br>");
			 out.println("Value");
		 out.println("</body>");	 
		 out.println("</html>");
	}
}
