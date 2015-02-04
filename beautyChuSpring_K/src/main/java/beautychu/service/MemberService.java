package beautychu.service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import beautychu.dao.MemberDao;
import beautychu.domain.Member;

@Service
public class MemberService {
	@Autowired MemberDao memberDao;
	@Autowired ServletContext servletContext; //why use that?

  /* email로 파일리스트를 뽑아온다. */
  public List<?> getList(String email) {
    return memberDao.getList(email);
  }	
	
	public Member validate(String email, String password) {
		HashMap<String, String> params = new HashMap<>();
		params.put("email", email);
		params.put("password", password);
		return memberDao.existUser(params);
	}

	public void insertUser(Member member) {
		memberDao.insertUser(member);
	}
	
	public void updateUser(Member member) {
	  memberDao.updateUser(member);
	}
	
	public void deleteUser(Member member) {
	  memberDao.deleteUser(member);
	}
	
	
	public void updatePPhoto(Member member) {
    memberDao.updatePPhoto(member);
  }
  

  /*서버에 파일(이미지) 올리기*/
public boolean fileUpload(MultipartHttpServletRequest mRequest, String email) {
 boolean isSuccess = false;

 // workspace 내부에 지정된 파일에 fileupload 폴더를 생성한다.
 String uploadPath = servletContext.getRealPath("/fileupload");

 File dir = new File(uploadPath);

 if (!dir.isDirectory()) {
   dir.mkdirs();
 }

 Iterator<String> iter = mRequest.getFileNames();
 System.out.println(mRequest);
 while(iter.hasNext()) {
   String uploadFileName = iter.next();

   MultipartFile mFile = null;
   mFile= mRequest.getFile(uploadFileName);
   String originalFileName = mFile.getOriginalFilename();
   System.out.println(mFile.getOriginalFilename());
   String filename = System.currentTimeMillis() + "_";
   String saveFileName = filename + originalFileName;

   if(saveFileName != null && !saveFileName.equals("")) {
     if(new File(uploadPath + "/" + saveFileName).exists()) {
       saveFileName = saveFileName + "_" + System.currentTimeMillis();
     }

     try {
       Member member = new Member();
       member.setEmail(email);
       member.setProfilePhoto( "/" + saveFileName); //check it
       mFile.transferTo(new File(uploadPath + "/" + saveFileName));
       memberDao.updatePPhoto(member);
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
