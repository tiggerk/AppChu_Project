package beautychu.domain;

import java.io.Serializable;
import java.util.List;

public class StylePhoto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	int stylePhotoNo;
	int styleNo;
	String url;
	List<?> photoList;
	
	public int getStylePhotoNo() {
		return stylePhotoNo;
	}
	public void setStylePhotoNo(int stylePhotoNo) {
		this.stylePhotoNo = stylePhotoNo;
	}
	public int getStyleNo() {
		return styleNo;
	}
	public void setStyleNo(int styleNo) {
		this.styleNo = styleNo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<?> getPhotoList() {
		return photoList;
	}
	public void setPhotoList(List<?> photoList) {
		this.photoList = photoList;
	}
	
	@Override
	public String toString() {
		return "StylePhoto [stylePhotoNo=" + stylePhotoNo + ", styleNo="
				+ styleNo + ", url=" + url + ", photoList=" + photoList + "]";
	}
	
	
}
