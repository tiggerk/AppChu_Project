package beautychu.domain;

import java.io.Serializable;

public class ShopList implements Serializable {

	private static final long serialVersionUID = 1L;

	String email;
	String shopName;
	String shopAddr;
	String shopPhotoNo;
	String shopPhotoUrl;
	
	
	public String getEmail() {
		return email;
	}
	public String getShopName() {
		return shopName;
	}
	public String getShopAddr() {
		return shopAddr;
	}
	public String getShopPhotoNo() {
		return shopPhotoNo;
	}
	public String getShopPhotoUrl() {
		return shopPhotoUrl;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public void setShopAddr(String shopAddr) {
		this.shopAddr = shopAddr;
	}
	public void setShopPhotoNo(String shopPhotoNo) {
		this.shopPhotoNo = shopPhotoNo;
	}
	public void setShopPhotoUrl(String shopPhotoUrl) {
		this.shopPhotoUrl = shopPhotoUrl;
	}
	@Override
	public String toString() {
		return "ShopList [email=" + email + ", shopName=" + shopName
				+ ", shopAddr=" + shopAddr + ", shopPhotoNo=" + shopPhotoNo
				+ ", shopPhotoUrl=" + shopPhotoUrl + "]";
	}
	
	
	
	

}
