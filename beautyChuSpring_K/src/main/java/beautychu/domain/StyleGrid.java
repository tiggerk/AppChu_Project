package beautychu.domain;

import java.io.Serializable;

public class StyleGrid implements Serializable {

	private static final long serialVersionUID = 1L;

	int styleNo;
	String styleName;
	String stylePhotoUrl;
	public int getStyleNo() {
		return styleNo;
	}
	public void setStyleNo(int styleNo) {
		this.styleNo = styleNo;
	}
	public String getStyleName() {
		return styleName;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public String getStylePhotoUrl() {
		return stylePhotoUrl;
	}
	public void setStylePhotoUrl(String stylePhotoUrl) {
		this.stylePhotoUrl = stylePhotoUrl;
	}
	
	
	@Override
	public String toString() {
		return "StyleGrid [styleNo=" + styleNo + ", styleName=" + styleName
				+ ", stylePhotoUrl=" + stylePhotoUrl + "]";
	}

	


	
	
	
	
}