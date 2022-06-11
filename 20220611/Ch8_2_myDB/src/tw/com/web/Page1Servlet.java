package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.db.DbTools;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
		PrintWriter out = 	resp.getWriter();
		out.println("Page1");
		try {
			Connection conn =  DbTools.getConnection();
		}catch(SQLException ex) {
			System.out.println(ex);
		}
	
		//testdb20220611
		}
}
