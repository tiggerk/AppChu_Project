package beautychu.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Review implements Serializable {

	private static final long serialVersionUID = 1L;
	
	int 		reviewNo;
	int 		styleNo;
	String 	content;
	int 		star;
	Date 		date;
	String 	email;
	String 	name;
	String		reviewbtn;
	String  	shopEmail;
	List<?> 	reviewList;
	
	
	public String getShopEmail() {
		return shopEmail;
	}
	public void setShopEmail(String shopEmail) {
		this.shopEmail = shopEmail;
	}
	public int getReviewNo() {
		return reviewNo;
	}
	public int getStyleNo() {
		return styleNo;
	}
	public String getContent() {
		return content;
	}
	public int getStar() {
		return star;
	}
	public Date getDate() {
		return date;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public String getReviewbtn() {
		return reviewbtn;
	}
	public List<?> getReviewList() {
		return reviewList;
	}
	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}
	public void setStyleNo(int styleNo) {
		this.styleNo = styleNo;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setReviewbtn(String reviewbtn) {
		this.reviewbtn = reviewbtn;
	}
	public void setReviewList(List<?> reviewList) {
		this.reviewList = reviewList;
	}
	@Override
	public String toString() {
		return "Review [reviewNo=" + reviewNo + ", styleNo=" + styleNo
				+ ", content=" + content + ", star=" + star + ", date=" + date
				+ ", email=" + email + ", name=" + name + ", reviewbtn="
				+ reviewbtn + ", shopEmail=" + shopEmail + ", reviewList="
				+ reviewList + "]";
	}
	
	
}
