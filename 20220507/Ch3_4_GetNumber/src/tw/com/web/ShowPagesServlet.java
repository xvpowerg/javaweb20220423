package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/show_pages")
public class ShowPagesServlet extends HttpServlet {
	private final int min = 5; 
	private final int max = 20;
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		String numberStr = req.getParameter("number");
		PrintWriter out =   resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.print("<style>");
		out.print("a {text-decoration: none}");
		out.print("a:hover {text-decoration: underline}");
		out.print("</style>");
		out.println("</head>");
		out.println("<body>");
		//矪瞶獶计
		int count = 0;
		try {
			count = Integer.parseInt(numberStr);				
		}catch(Exception ex) {
			out.println("EMPTY");
			System.out.println("numberStr ex:"+ex);
		}
		//矪瞶计程籔程
		 if (count < 0) {
			 count = min;
		 }else if(count > max) {
			 count = max;
		 }
		
		
		for(int i = 1;i<=count;i++) {
			out.println("<a href='#'>");
			out.println(i);
			out.println("</a>	");					
		}
		
		out.println("</body>");
		out.println("</html>");
		//out.println(numberStr);
		
	}
}
