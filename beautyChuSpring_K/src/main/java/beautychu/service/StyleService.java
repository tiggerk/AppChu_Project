package beautychu.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.StyleDao;
import beautychu.domain.Member;
import beautychu.domain.Style;

@Service
public class StyleService {
  @Autowired StyleDao styleDao;
  
  public List<?> getList() {
    return styleDao.getList(); 
  }
  
  
/*	public Style validate(String email, String password) {
		HashMap<String, String> params = new HashMap<>();
		params.put("email", email);
		params.put("password", password);
		return styleDao.existUser(params);
	}*/

	public void insertStyle(Style style) {
		styleDao.insertStyle(style);
	}
}







