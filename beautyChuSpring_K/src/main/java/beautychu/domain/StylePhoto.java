package beautychu.domain;

import java.io.Serializable;

public class StylePhoto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	int stylePhotoNo;
	int styleNo;
	String url;
	
	public int getStylePhotoNumber() {
		return stylePhotoNo;
	}
	public void setStylePhotoNumber(int stylePhotoNo) {
		this.stylePhotoNo = stylePhotoNo;
	}
	public int getStyleNumber() {
		return styleNo;
	}
	public void setStyleNumber(int styleNo) {
		this.styleNo = styleNo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "StylePhoto [stylePhotoNo=" + stylePhotoNo
				+ ", styleNo=" + styleNo + ", url=" + url
				+ "]";
	}
	
	
	
}
