package beautychu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import beautychu.dao.StyleDao;
import beautychu.domain.Review;
import beautychu.domain.Style;
import beautychu.domain.StyleDetail;
import beautychu.domain.StyleGrid;

@Service
public class StyleService {
	@Autowired StyleDao styleDao;

	public List<?> getMainStyleList() {
		return styleDao.getMainStyleList(); 
	}

	public List<?> getMainCelebrityList() {
		return styleDao.getMainCelebrityList(); 
	}


	public List<?> getList(StyleGrid styleList) {
		return styleDao.getList(styleList); 
	}

	public List<?> getGridList() {
		return styleDao.getGridList(); 
	}

	public void insertStyle(Style style) {
		styleDao.insertStyle(style);
	}

	public StyleDetail get(Review review) {
		System.out.println(review.getStyleNo());
		StyleDetail styleDetail = styleDao.getStyleDetail(review.getStyleNo());
		styleDetail.setPhotoList( styleDao.selectPhoto(review.getStyleNo()));
		styleDetail.setReview( styleDao.getReviewList(review));
		return styleDetail;
	}
	
	@Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
	public void add(Style style) {
		styleDao.insertStyle(style);

		if (style.getStylePhotoUrl() != null){
			styleDao.insertStylePhotoUrl(style);
		}
	}
}







