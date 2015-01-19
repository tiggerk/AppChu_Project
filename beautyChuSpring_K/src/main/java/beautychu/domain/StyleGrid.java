package beautychu.domain;

import java.io.Serializable;

public class StyleGrid implements Serializable {

	private static final long serialVersionUID = 1L;

	int styleNumber;
	String styleName;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "StyleGrid [styleNumber=" + styleNumber + ", styleName="
				+ styleName + ", url=" + url + "]";
	}
	
	


	
	
	
	
}