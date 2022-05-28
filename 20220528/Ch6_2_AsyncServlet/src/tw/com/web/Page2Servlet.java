package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//asyncSupported 
@WebServlet(urlPatterns = {"/page2"},asyncSupported = true)
public class Page2Servlet extends HttpServlet {
	private ExecutorService es;
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		es = Executors.newCachedThreadPool();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	AsyncContext ctx = req.startAsync();//���o�D�P�B������
	//�f�tAJAX�ϥ�
	es.execute(()->{
		System.out.println("Start!"+Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(5);	
				
			PrintWriter out = 	ctx.getResponse().getWriter();
			out.print("Complete!");
			ctx.complete();
			
			}catch(Exception ex) {
				
			}
	System.out.println("Start!"+Thread.currentThread().getName());
			//out.println("Complete out!:"+Thread.currentThread().getName());
	});


	

	}
}
