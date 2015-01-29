package beautychu.domain;

import java.io.Serializable;
import java.util.List;

public class StyleDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	int 		styleNumber;
	String 	styleName;
	String 	styleIntro;
	int 		price;
	String 	url;
	String 	email;
	List<?> 	photoList;
	List<?>	review;
	
	
	
	
	public int getStyleNumber() {
		return styleNumber;
	}
	public String getStyleName() {
		return styleName;
	}
	public String getStyleIntro() {
		return styleIntro;
	}
	public int getPrice() {
		return price;
	}
	public String getUrl() {
		return url;
	}
	public String getEmail() {
		return email;
	}
	public List<?> getPhotoList() {
		return photoList;
	}
	public List<?> getReview() {
		return review;
	}
	public void setStyleNumber(int styleNumber) {
		this.styleNumber = styleNumber;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public void setStyleIntro(String styleIntro) {
		this.styleIntro = styleIntro;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhotoList(List<?> photoList) {
		this.photoList = photoList;
	}
	public void setReview(List<?> review) {
		this.review = review;
	}
	
	
	
	@Override
	public String toString() {
		return "StyleDetail [styleNumber=" + styleNumber + ", styleName="
				+ styleName + ", styleIntro=" + styleIntro + ", price=" + price
				+ ", url=" + url + ", email=" + email + ", photoList="
				+ photoList + ", review=" + review + "]";
	}
	

	
	
	
	


	
	
	
}
