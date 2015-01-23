package beautychu.domain;

import java.io.Serializable;

public class MainStyle implements Serializable {

	private static final long serialVersionUID = 1L;

	String stylePhotoUrl;
	String styleName;
	String shopName;
	int styleNo;
	
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
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
		return "MainStyle [stylePhotoUrl=" + stylePhotoUrl + ", styleName="
				+ styleName + ", shopName=" + shopName + ", styleNo=" + styleNo
				+ "]";
	}
	
	
}