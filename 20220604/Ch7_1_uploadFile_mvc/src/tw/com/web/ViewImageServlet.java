package tw.com.web;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import tw.com.web.tootls.ImageUploadTools;

//標記此Servlet是檔案上傳用的Servlet

@WebServlet("/view_images")
public class ViewImageServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		
	 	List<String> imagList  =  ImageUploadTools.getImageFileNames();
	 	String showImagePath = ImageUploadTools.getShowImagePath();
	 	req.setAttribute("imagList", imagList);
		req.setAttribute("show_image_path", showImagePath);
	 	req.getRequestDispatcher("view_image.jsp").
	 	forward(req,resp);
	 	
	}
}
