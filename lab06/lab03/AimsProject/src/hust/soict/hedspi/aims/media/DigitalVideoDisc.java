package hust.soict.hedspi.aims.media;

import java.util.StringTokenizer;

public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean search(String title) {
		String mydelim = " ";
		StringTokenizer tokenTitle =
	            new StringTokenizer(title, mydelim);
		int count = tokenTitle.countTokens();
		String discTitle = this.getTitle();
		for(int i = 0; i<count; i++) {
			if(discTitle.contains(tokenTitle.nextToken())) {
				return true;
			}
		}
		return false;
		
	}
}
