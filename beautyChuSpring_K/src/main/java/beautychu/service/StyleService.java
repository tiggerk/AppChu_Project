package beautychu.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import beautychu.dao.StyleDao;
import beautychu.domain.Member;
import beautychu.domain.Style;

@Service
public class StyleService {
  @Autowired StyleDao styleDao;
  
  public List<?> getMainStyleList() {
	    return styleDao.getMainStyleList(); 
  }
  
  public List<?> getList() {
	    return styleDao.getList(); 
  }
  
  public List<?> getGridList() {
	    return styleDao.getGridList(); 
	  }
  
  public List<?> getStyleDetail() {
	    return styleDao.getStyleDetail(); 
	  }

	public void insertStyle(Style style) {
		styleDao.insertStyle(style);
	}
	
	@Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
		  public void add(Style style) {
		    styleDao.insertStyle(style);
		    
		    if (style.getStylePhotoUrl() != null){
		      styleDao.insertStylePhotoUrl(style);
		    }
		  }
	
	
}







