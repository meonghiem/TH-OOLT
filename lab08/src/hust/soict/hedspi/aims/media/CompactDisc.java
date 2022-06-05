package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{

	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();
	
	
	public String getArtist() {
		return artist;
	}


	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}

	
	public CompactDisc(String title, String category, float cost, String director, String artist, Track ...args) {
		super(title, category, cost, director);
		this.artist = artist;
		for(Track track: args) {
			this.addTrack(track);
		}
	}
	
	public void addTrack(Track inputTrack) {
		if(!this.tracks.contains(inputTrack)) {
			this.tracks.add(inputTrack);
		}
	}
	
	public void removeTrack(Track inputTrack) {
		if(this.tracks.contains(inputTrack)) {
			this.tracks.remove(inputTrack);
		}
	}

	public int getLength() {
		int length = 0;
		for(Track track: this.tracks) {
			length += track.getLength();
		}
		return length;
	}
	
	public void play() {
		System.out.println("artist: " + this.getArtist());
		for(Track track : this.tracks) {
			track.play();
		}
	}
	
	public int compareTo(Object o) {
		CompactDisc obj = (CompactDisc) o;
		if(this.getLength() < obj.getLength()) return -1;
		if(this.getLength() == obj.getLength()) return 0;
		else return 1;
		
	}
}
