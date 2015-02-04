package beautychu.dao;

import java.util.List;

import beautychu.domain.StylePhoto;

public interface StylePhotoDao {
	
	  List<?> getList(int styleNo);
	  
	  List<?> getPhotoList(int styleNo);
	  void insertStylePhoto(StylePhoto stylePhoto);
	  void insertStylePhotoList(StylePhoto stylePhoto);

	}