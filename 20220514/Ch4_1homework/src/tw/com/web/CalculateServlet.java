package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcu")
public class CalculateServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String strN1 = req.getParameter("n1");
		String strN2 = req.getParameter("n2");
		String act = req.getParameter("act");
		PrintWriter out = resp.getWriter();
		System.out.println("act:"+act);
		int n1 =0; 
		int n2 =0;
		try {
			n1 = Integer.parseInt(strN1);
			n2 = Integer.parseInt(strN2);
		}catch(Exception ex) {
			System.out.println("¿é¤J¿ù»~ªº¼Æ¦r");
			return;
		}
		
		switch(act) {
		case "+":
			out.println("ans:"+(n1+n2));
			break;
			
		case "-":
			out.println("ans:"+(n1-n2));
			break;	
		}
		
		
		
	}
}
