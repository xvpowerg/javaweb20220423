package tw.com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class MyContextListener implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("contextInitialized!!");
		ServletContext sc = sce.getServletContext();
		String dbname = sc.getInitParameter("dbname");
		String dbpassword = sc.getInitParameter("dbpassword");
		System.out.println(dbname+":"+dbpassword);
		DbTools.initDbTools(dbname, dbpassword);
	}
	
}
