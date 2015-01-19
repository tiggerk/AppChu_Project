package beautychu.domain;

import java.io.Serializable;

public class StyleDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	int styleNumber;
	String styleName;
	String styleIntro;
	int SkillTime;
	int price;
	String url;
	
	
	public int getStyleNumber() {
		return styleNumber;
	}
	public void setStyleNumber(int styleNumber) {
		this.styleNumber = styleNumber;
	}
	public String getStyleName() {
		return styleName;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public String getStyleIntro() {
		return styleIntro;
	}
	public void setStyleIntro(String styleIntro) {
		this.styleIntro = styleIntro;
	}
	public int getSkillTime() {
		return SkillTime;
	}
	public void setSkillTime(int skillTime) {
		SkillTime = skillTime;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "StyleDetail [styleNumber=" + styleNumber + ", styleName="
				+ styleName + ", styleIntro=" + styleIntro + ", SkillTime="
				+ SkillTime + ", price=" + price + ", url=" + url + "]";
	}
	

	
	
	
}
