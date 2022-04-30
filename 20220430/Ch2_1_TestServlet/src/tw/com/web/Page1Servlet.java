package tw.com.web;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{

	//取值 一般預設
	//速度快!	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		//HttpServletRequest 輸入
		//HttpServletResponse 輸出
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
