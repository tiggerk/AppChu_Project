package beautychu.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class ShopInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	String email;
	String licenseeNo;
	String shopName;
	String shopAddr;
	String shopTel;
	String shopIntro;
	String shopPhotoNo;
	String shopPhotoUrl;
	MultipartFile photofile;
	List<?> photoList;
	
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
	public String getShopPhotoNo() {
		return shopPhotoNo;
	}
	public void setShopPhotoNo(String shopPhotoNo) {
		this.shopPhotoNo = shopPhotoNo;
	}
	public String getShopPhotoUrl() {
		return shopPhotoUrl;
	}
	public void setShopPhotoUrl(String shopPhotoUrl) {
		this.shopPhotoUrl = shopPhotoUrl;
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
		return "ShopInfo [email=" + email + ", licenseeNo=" + licenseeNo
				+ ", shopName=" + shopName + ", shopAddr=" + shopAddr
				+ ", shopTel=" + shopTel + ", shopIntro=" + shopIntro
				+ ", shopPhotoNo=" + shopPhotoNo + ", shopPhotoUrl="
				+ shopPhotoUrl + ", photofile=" + photofile + ", photoList="
				+ photoList + "]";
	}
	
}
