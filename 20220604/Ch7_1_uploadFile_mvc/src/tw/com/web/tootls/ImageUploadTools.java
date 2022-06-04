package tw.com.web.tootls;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImageUploadTools {
	private static String imagePath;
	private static String showImagePath;
	static void initPath(String path,String showPath) {
		imagePath = path;
		showImagePath = showPath;
	}
	
	public static String getShowImagePath() {
		return showImagePath;
	}
	public static void uploadFile(InputStream srcInputStr,
			String targetFileName) throws IOException{
		 Path targetPath = Paths.get(imagePath,targetFileName);
	
			 Files.copy(srcInputStr, 
					 targetPath,
					 StandardCopyOption.REPLACE_EXISTING); 
	
	}
	
	public static List<String> getImageFileNames()throws IOException{
		List<String> fileNameList = new ArrayList<>();
		Path path = Paths.get(imagePath);
		fileNameList = Files.list(path).
		map(p->p.getFileName().toString()).
		collect(Collectors.toList());
		return fileNameList;
	}
	

}
