package beautychu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.ReviewDao;
import beautychu.domain.Review;

@Service
public class ReviewService {
  @Autowired ReviewDao reviewDao;
  
	public void insertReview(Review review) {
		reviewDao.insertReview(review);
	}
	
	public void deleteReview(int reviewNo) {
		reviewDao.deleteReview(reviewNo);
	}

	public void updateReview(Review review) {
		reviewDao.updateReview(review);
	}

	
	
	public Review getReviewList(Review review) {
		System.out.println(review);
		System.out.println("**********************************"+reviewDao.selectReviewList(review));
		Review reviewList = new Review();
		reviewList.setReviewList(reviewDao.selectReviewList(review));
		System.out.println("222222222222222222222222"+reviewList);
		return reviewList;
	}
}







