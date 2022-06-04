package tw.com.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.geronimo.microprofile.openapi.impl.processor.spi.NamingStrategy.Http;
@WebFilter("/page/*")
public class AuthFilter implements Filter{
	//Page1 AC
	//Page2 B
	//Page3 C
	Map<String,Set<String>> authMap = new HashMap<>();
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Set<String> set1 =  new HashSet<>();
		Set<String> set2 =  new HashSet<>();
		Set<String> set3 =  new HashSet<>();
	
		set1.add("a");
		set1.add("c");
		
		set2.add("b");
		
		set3.add("c");
		
		authMap.put("/page/page1", set1);
		authMap.put("/page/page2", set2);
		authMap.put("/page/page3", set3);

		
	}
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain)
			throws IOException, ServletException {
		
		// TODO Auto-generated method stub
		String user = req.getParameter("user");
		HttpServletRequest httpReq = (HttpServletRequest)req;
		String page = httpReq.getServletPath();
		System.out.println(page);
		if (authMap.get(page)!=null && 
				authMap.get(page).contains(user)) {
			chain.doFilter(req, resp);
		}

//		else {
//			String cpath = httpReq.getContextPath();
//			System.out.println("cpath:"+cpath);
//			HttpServletResponse httpResp = (HttpServletResponse)resp;
//			httpResp.sendRedirect(cpath+"/error.html");
//		}
		
	}

}
