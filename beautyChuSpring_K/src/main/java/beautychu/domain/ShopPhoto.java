package beautychu.domain;

import java.io.Serializable;

public class ShopPhoto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	int no;
	String email;
	String url;
	
	
	
	
	public int getNo() {
		return no;
	}
	public String getEmail() {
		return email;
	}
	public String getUrl() {
		return url;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	@Override
	public String toString() {
		return "ShopPhoto [no=" + no + ", email=" + email + ", url=" + url
				+ "]";
	}
	

	
	
	
	
	
	
	
}
