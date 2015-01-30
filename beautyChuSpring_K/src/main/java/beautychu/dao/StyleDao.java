package beautychu.dao;

import java.util.List;
import java.util.Map;

import beautychu.domain.Member;
import beautychu.domain.Review;
import beautychu.domain.Style;
import beautychu.domain.StyleDetail;
import beautychu.domain.StyleGrid;
import beautychu.domain.StylePhoto;

public interface StyleDao {
	
	 List<?> getList(Style style);
	  List<?> getGridList();
	  StyleDetail getStyleDetail(int styleNo);
	  
	  List<?> getMainStyleList();
	  List<?> getMainCelebrityList();

	  void insertStyle(Style style);
	  void insertStylePhotoUrl(Style style);
	  
	  List<?> selectPhoto(int styleNo);
	  List<?> getReviewList(Review review);
	  
	  List<?> getPhotoList(int styleNo);
	  void insertStylePhoto(StylePhoto stylePhoto);
	  void insertStylePhotoList(StylePhoto stylePhoto);
	
	}