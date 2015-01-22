package beautychu.dao;

import java.util.List;
import java.util.Map;

import beautychu.domain.Style;
import beautychu.domain.StylePhoto;

public interface StylePhotoDao {
	
	  List<?> getList(int styleNo);
	  void insertStylePhoto(StylePhoto stylePhoto);
	  void insertStylePhotoList(StylePhoto stylePhoto);
	}