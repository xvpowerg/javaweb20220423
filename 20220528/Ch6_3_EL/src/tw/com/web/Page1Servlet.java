package tw.com.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.web.bean.Item;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Item item1  = new Item("item1",100);
		Item item2  = new Item("item2",200);
		Item item3  = new Item("item3",300);
		Item item4  = new Item("item4",400);
		Item item5  = new Item("item5",500);
		
		ArrayList<Item> list  = new ArrayList();
		list.add(item1);
		list.add(item2);
		list.add(item3);
		list.add(item4);
		list.add(item5);
		HttpSession session = req.getSession();
		session.setAttribute("itemList", list);
		
		req.setAttribute("item", item1);
		req.getRequestDispatcher("index.jsp").
		forward(req, resp);
	}
}
