package beautychu.domain;

import java.io.Serializable;

public class StyleGrid implements Serializable {

	private static final long serialVersionUID = 1L;

	int 		styleNo;
	String 	email;
	String 	styleName;
	String   	styleLength;
	String 	gender;
	String		styleSort;
	String 	stylePhotoUrl;
	String 	people;
	
	public int getStyleNo() {
		return styleNo;
	}
	public String getEmail() {
		return email;
	}
	public String getStyleName() {
		return styleName;
	}
	public String getStyleLength() {
		return styleLength;
	}
	public String getGender() {
		return gender;
	}
	public String getStyleSort() {
		return styleSort;
	}
	public String getStylePhotoUrl() {
		return stylePhotoUrl;
	}
	public void setStyleNo(int styleNo) {
		this.styleNo = styleNo;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public void setStyleLength(String styleLength) {
		this.styleLength = styleLength;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setStyleSort(String styleSort) {
		this.styleSort = styleSort;
	}
	public void setStylePhotoUrl(String stylePhotoUrl) {
		this.stylePhotoUrl = stylePhotoUrl;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	@Override
	public String toString() {
		return "StyleGrid [styleNo=" + styleNo + ", email=" + email
				+ ", styleName=" + styleName + ", styleLength=" + styleLength
				+ ", gender=" + gender + ", styleSort=" + styleSort
				+ ", stylePhotoUrl=" + stylePhotoUrl + ", people=" + people
				+ "]";
	}

	
	
	
	
	


	

	
	


	
	
	
	
}