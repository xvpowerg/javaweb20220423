package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.faces.util.Json.Option;

@WebServlet("/wellcome")
public class WellcomeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=utf-8");
		  PrintWriter out = resp.getWriter();		
		  String act = req.getParameter("act");
		  StringBuilder msg = new StringBuilder();
		  msg.append(act);
		  msg.append("歡迎您第1次登入");
		  List<Integer> countList = new ArrayList(); 
		
		  countList.add(0);
		  Cookie[] cookies =   req.getCookies();
		  Optional<Cookie[]> cop =Optional.ofNullable(cookies);
		  cop.ifPresent((c)->{
			  
			  Stream<Cookie> cookiesStream = Stream.of(c);
			 Optional<Cookie> cookOp =  cookiesStream.filter(cook->cook.getName().equals(act)).
			  findFirst();
			  
			  if (cookOp.isPresent()) {
				String countStr =   cookOp.get().getValue();
				 int count = Integer.parseInt(countStr);				
				 countList.set(0, count);
				 msg.setLength(0);//清空msg
				 msg.append("歡迎您第"+(count + 1)+"登入") ;				  
			  }
			  
		  });
		  
		  out.println(msg);
		  
		  int count = countList.get(0);
		  ++count;
		  Cookie countCoolkie = new Cookie(act,count+"");
		  resp.addCookie(countCoolkie);
	}
}
