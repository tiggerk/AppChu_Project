package beautychu.dao;

import java.util.List;
import java.util.Map;

import beautychu.domain.Member;
import beautychu.domain.Style;

public interface StyleDao {
	
	  List<?> getList();
	  List<?> getGridList();
	  List<?> getStyleDetail();
	  /*Style existUser(Map<String,String> params);*/
	  void insertStyle(Style style);
	  void insertPhoto(Style style);
	  
	}