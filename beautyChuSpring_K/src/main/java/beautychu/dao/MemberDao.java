package beautychu.dao;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import beautychu.domain.Customer;
import beautychu.domain.Member;

public interface MemberDao {
	
	  Member existUser(Map<String,String> params);
	  void insertUser(Member member);
	  void updateUser(Member member);
	  void deleteUser(Member member);
	  
	  void setPPhoto(Customer customer);
	  void insertPPhoto(Customer customer);
	  void updatePPhoto(Member member);
	  void fileUpload(MultipartHttpServletRequest mRequest);
	  
	  List<?> getList(String email);
	}