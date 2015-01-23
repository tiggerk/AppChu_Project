package beautychu.dao;

import java.util.List;
import java.util.Map;

import beautychu.domain.Member;
import beautychu.domain.Style;
import beautychu.domain.StylePhoto;

public interface StyleDao {
	
	  List<?> getList();
	  List<?> getGridList();
	  List<?> getStyleDetail();
	  List<?> getMainStyleList();
	  /*Style existUser(Map<String,String> params);*/
	  void insertStyle(Style style);
	  void insertStylePhotoUrl(Style style);
	  
	  List<?> getPhotoList(int styleNo);
	  /*void insertStylePhotoList(Style style);*/
	  
	  /*List<?> getPhotoList(int styleNo);*/
	  void insertStylePhoto(StylePhoto stylePhoto);
	  void insertStylePhotoList(StylePhoto stylePhoto);
	
	}