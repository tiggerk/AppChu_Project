package beautychu.domain;

import java.io.Serializable;

public class MainCelebrity implements Serializable {

	private static final long serialVersionUID = 1L;

	String stylePhotoUrl;
	String styleName;
	String genre;
	String genreTitle;
	int styleNo;
	
	public String getStylePhotoUrl() {
		return stylePhotoUrl;
	}
	public void setStylePhotoUrl(String stylePhotoUrl) {
		this.stylePhotoUrl = stylePhotoUrl;
	}
	public String getStyleName() {
		return styleName;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGenreTitle() {
		return genreTitle;
	}
	public void setGenreTitle(String genreTitle) {
		this.genreTitle = genreTitle;
	}
	public int getStyleNo() {
		return styleNo;
	}
	public void setStyleNo(int styleNo) {
		this.styleNo = styleNo;
	}
	
	@Override
	public String toString() {
		return "MainCelebrity [stylePhotoUrl=" + stylePhotoUrl + ", styleName="
				+ styleName + ", genre=" + genre + ", genreTitle=" + genreTitle
				+ ", styleNo=" + styleNo + "]";
	}
	
}