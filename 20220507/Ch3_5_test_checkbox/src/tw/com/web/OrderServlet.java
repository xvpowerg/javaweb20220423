package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	private Map<String,String>foodMap = new HashMap<>();
	@Override
	public void init() throws ServletException {
		foodMap.put("0", "���L");
		foodMap.put("1", "�ư�");
		foodMap.put("2", "����");
	}
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		String[] foods = req.getParameterValues("food");
		Map<String,String[]> dataMap = req.getParameterMap();
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		if (foods == null) {
			out.println("�п�ܤ@���\�I");
			return;
		}
		//�i��ܩҦ���Parameter�Ѽ� �P������value
		dataMap.forEach((k,v)->{
			
			System.out.print(k+":");
			for (String v1 : v) {
				System.out.print(v1+" ");
			}
			System.out.println();
		});
	
		
		for (int i= 0; i < foods.length;i++) {
				out.println(foodMap.get(foods[i]));
		}
		
	}
}
