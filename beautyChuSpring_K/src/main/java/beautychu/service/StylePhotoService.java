package beautychu.service;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import beautychu.dao.StylePhotoDao;
import beautychu.domain.StylePhoto;

@Service
public class StylePhotoService {
  @Autowired StylePhotoDao stylePhotoDao;
  @Autowired ServletContext servletContext;
  
  public List<?> getList(int no) {
    return stylePhotoDao.getList(no); 
  }
  
  /*서버에 파일(이미지) 올리기*/
	public boolean fileUpload(MultipartHttpServletRequest mRequest, int styleNo) {
		boolean isSuccess = false;

		String uploadPath = servletContext.getRealPath("/fileupload");
		/*String uploadPath = "/file/";*/

		File dir = new File(uploadPath);

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
					StylePhoto stylePhoto = new StylePhoto();
					stylePhoto.setStyleNo(styleNo);
					stylePhoto.setUrl( "/" + saveFileName);
					mFile.transferTo(new File(uploadPath + "/" + saveFileName));
					stylePhotoDao.insertStylePhoto(stylePhoto);
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







