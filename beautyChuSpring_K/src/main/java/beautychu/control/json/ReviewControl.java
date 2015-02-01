package beautychu.control.json;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import beautychu.domain.Member;
import beautychu.domain.Review;
import beautychu.service.ReviewService;

@Controller("json.reviewControl")
@RequestMapping("/json/review")
public class ReviewControl {
//	static Logger log = Logger.getLogger(ProductControl.class);

	@Autowired
	ReviewService reviewService;

	@RequestMapping("/reviewAdd")
	public Object reviewAdd(Review review, HttpSession ssetion) throws Exception {
		Member member = (Member) ssetion.getAttribute("loginUser");
		System.out.println(member);
		review.setEmail(member.getEmail());
		reviewService.insertReview(review);
		System.out.println(review);
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");
		return resultMap;
	}
	
	  @RequestMapping("/delete")
	  public Object delete(int no) throws Exception {
	    reviewService.deleteReview(no);
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    return resultMap;
	  }
	
	  
	  @RequestMapping("/updateReview")
	  public Object update(Review review) throws Exception {
		  System.out.println("$$$$$$$$$$$$"+review);
	    reviewService.updateReview(review);
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    return resultMap;
	  }
	
	  
		@RequestMapping("/reviewList")
		public Object detail(Review review,Model model,HttpSession session) throws Exception {
			System.out.println("++++++++++++++++++++++++++"+review);
			Member member =  (Member) session.getAttribute("loginUser");
			if (session.getAttribute("loginUser") != null) {
				review.setEmail(member.getEmail());
			}
			Review reviewList = reviewService.getReviewList(review);
			HashMap<String, Object> resultMap = new HashMap<>();
			resultMap.put("review", reviewList.getReviewList());
			System.out.println("리뷰===========>"+resultMap);
			return resultMap;
		}
	

}
