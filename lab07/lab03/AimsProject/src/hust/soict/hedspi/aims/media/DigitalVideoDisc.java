package hust.soict.hedspi.aims.media;

import java.util.StringTokenizer;

public class DigitalVideoDisc extends Disc implements Playable {
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());

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
	public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
		super(title, category, cost, length, director);
		// TODO Auto-generated constructor stub
	}
	
	
}
