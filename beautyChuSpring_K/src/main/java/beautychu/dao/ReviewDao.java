package beautychu.dao;


import java.util.List;

import beautychu.domain.Review;

public interface ReviewDao {
	
	
	List<?> selectReviewList(Review review);
	void insertReview(Review review);
	void deleteReview(int reviewNo);
	void updateReview(Review review);

	}