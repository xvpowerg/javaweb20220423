package tw.com.web;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import tw.com.web.tootls.ImageUploadTools;

//標記此Servlet是檔案上傳用的Servlet
@MultipartConfig
@WebServlet("/upload")
public class UploadFileServlet  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		
		Part part = req.getPart("photo");
		 String targetFileName  =
				 part.getSubmittedFileName();	 
		 ImageUploadTools.uploadFile(
				 part.getInputStream(),
				 targetFileName);
		 resp.sendRedirect("view_images");
	}
}
