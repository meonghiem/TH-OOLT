package hust.soict.hedspi.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	
	
	public String getTitle() {
		return title;
	}


	public int getLength() {
		return length;
	}


	public Track() {
		// TODO Auto-generated constructor stub
	}


	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}


	public Track(String title) {
		super();
		this.title = title;
	}


	public Track(int length) {
		super();
		this.length = length;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());

	}
	
	public boolean equals(Object o) {
		Track obj = (Track) o;
		if(obj == null) return false;
		if(this.getTitle().equals(obj.getTitle()) && this.getLength() == obj.getLength()) return true;
		return false;
	}
	
}
