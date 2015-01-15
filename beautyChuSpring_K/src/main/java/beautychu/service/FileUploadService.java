package beautychu.service;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service
public class FileUploadService {
	
	@Autowired ServletContext servletContext;

	public boolean fileUpload(MultipartHttpServletRequest mRequest) {

		boolean isSuccess = false;
		
		String uploadPath = servletContext.getRealPath("/fileupload");
		/*String uploadPath = "/file/";*/
		
		File dir = new File(uploadPath);
		/*File dir = new File(uploadPath);*/

		if (!dir.isDirectory()) {
			dir.mkdirs();
		}
		
		Iterator<String> iter = mRequest.getFileNames();
		System.out.println(mRequest);
		while(iter.hasNext()) {
			String uploadFileName = iter.next();
			
			MultipartFile mFile = mRequest.getFile(uploadFileName);
			String originalFileName = mFile.getOriginalFilename();
			System.out.println(mFile.getOriginalFilename());
			String filename = System.currentTimeMillis() + "_";
			String saveFileName = filename + originalFileName;
			
			if(saveFileName != null && !saveFileName.equals("")) {
				if(new File(uploadPath + "/" + saveFileName).exists()) {
					saveFileName = saveFileName + "_" + System.currentTimeMillis();
				}
				
				try {
					mFile.transferTo(new File(uploadPath + "/" + saveFileName));
					isSuccess = true;				
				} catch (IllegalStateException e) {
					e.printStackTrace();
					isSuccess = false;
				} catch (IOException e) {
					e.printStackTrace();
					isSuccess = false;
				}
			} // if end
		} // while end
		return isSuccess;
	} // fileUpload end

}
