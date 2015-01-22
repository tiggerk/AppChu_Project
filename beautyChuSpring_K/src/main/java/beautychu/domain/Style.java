package beautychu.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class Style implements Serializable {

	private static final long serialVersionUID = 1L;

	int styleNo;
	String email;
	String people;
	String gender;
	String styleSort;
	String styleLength;
	String styleName;
	int price;
	String styleIntro;
	
	String stylePhotoNo;
	String stylePhotoUrl;
	MultipartFile photofile;
	List<?> photoList;
	
	public int getStyleNo() {
		return styleNo;
	}
	public void setStyleNo(int styleNo) {
		this.styleNo = styleNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStyleSort() {
		return styleSort;
	}
	public void setStyleSort(String styleSort) {
		this.styleSort = styleSort;
	}
	public String getStyleLength() {
		return styleLength;
	}
	public void setStyleLength(String styleLength) {
		this.styleLength = styleLength;
	}
	public String getStyleName() {
		return styleName;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStyleIntro() {
		return styleIntro;
	}
	public void setStyleIntro(String styleIntro) {
		this.styleIntro = styleIntro;
	}
	public String getStylePhotoNo() {
		return stylePhotoNo;
	}
	public void setStylePhotoNo(String stylePhotoNo) {
		this.stylePhotoNo = stylePhotoNo;
	}
	public String getStylePhotoUrl() {
		return stylePhotoUrl;
	}
	public void setStylePhotoUrl(String stylePhotoUrl) {
		this.stylePhotoUrl = stylePhotoUrl;
	}
	public MultipartFile getPhotofile() {
		return photofile;
	}
	public void setPhotofile(MultipartFile photofile) {
		this.photofile = photofile;
	}
	public List<?> getPhotoList() {
		return photoList;
	}
	public void setPhotoList(List<?> photoList) {
		this.photoList = photoList;
	}
	
	@Override
	public String toString() {
		return "Style [styleNo=" + styleNo + ", email=" + email + ", people="
				+ people + ", gender=" + gender + ", styleSort=" + styleSort
				+ ", styleLength=" + styleLength + ", styleName=" + styleName
				+ ", price=" + price + ", styleIntro=" + styleIntro
				+ ", stylePhotoNo=" + stylePhotoNo + ", stylePhotoUrl="
				+ stylePhotoUrl + ", photofile=" + photofile + ", photoList="
				+ photoList + "]";
	}
	
}
