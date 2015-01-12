package beautychu.domain;

import java.io.Serializable;

public class ShopInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	String email;
	String licenseeNo;
	String shopName;
	String shopAddr;
	String shopTel;
	String shopIntro;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLicenseeNo() {
		return licenseeNo;
	}
	public void setLicenseeNo(String licenseeNo) {
		this.licenseeNo = licenseeNo;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopAddr() {
		return shopAddr;
	}
	public void setShopAddr(String shopAddr) {
		this.shopAddr = shopAddr;
	}
	public String getShopTel() {
		return shopTel;
	}
	public void setShopTel(String shopTel) {
		this.shopTel = shopTel;
	}
	public String getShopIntro() {
		return shopIntro;
	}
	public void setShopIntro(String shopIntro) {
		this.shopIntro = shopIntro;
	}
	@Override
	public String toString() {
		return "ShopInfo [email=" + email + ", licenseeNo=" + licenseeNo
				+ ", shopName=" + shopName + ", shopAddr=" + shopAddr
				+ ", shopTel=" + shopTel + ", shopIntro=" + shopIntro + "]";
	}
	
	
	

	
}
