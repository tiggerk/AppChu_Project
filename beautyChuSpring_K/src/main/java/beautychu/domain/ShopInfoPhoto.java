package beautychu.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class ShopInfoPhoto implements Serializable {

	private static final long serialVersionUID = 1L;

	int shopPhotoNo;
	String email;
	String shopPhotoUrl;
	
	public int getShopPhotoNo() {
		return shopPhotoNo;
	}
	public void setShopPhotoNo(int shopPhotoNo) {
		this.shopPhotoNo = shopPhotoNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getShopPhotoUrl() {
		return shopPhotoUrl;
	}
	public void setShopPhotoUrl(String shopPhotoUrl) {
		this.shopPhotoUrl = shopPhotoUrl;
	}
	
	@Override
	public String toString() {
		return "ShopInfoPhoto [shopPhotoNo=" + shopPhotoNo + ", email=" + email
				+ ", shopPhotoUrl=" + shopPhotoUrl + "]";
	}
	
}
