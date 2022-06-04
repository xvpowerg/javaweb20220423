package tw.com.web.tootls;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class InitToolsContextListener  implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		String imagePath = 
				sce.getServletContext().
				getInitParameter("file_path");
			String showImagePath = 
					sce.getServletContext().getInitParameter("show_image_path");
		
		ImageUploadTools.initPath(imagePath,showImagePath);
		
		
	}
}
