package beautychu.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class PriceListShopInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	int priceListNo;
	String type;
	String gender;
	int price;
	String email;
	
	public int getPriceListNo() {
		return priceListNo;
	}
	public void setPriceListNo(int priceListNo) {
		this.priceListNo = priceListNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "PriceListShopInfo [priceListNo=" + priceListNo + ", type="
				+ type + ", gender=" + gender + ", price=" + price + ", email="
				+ email + "]";
	}
	
	
}
