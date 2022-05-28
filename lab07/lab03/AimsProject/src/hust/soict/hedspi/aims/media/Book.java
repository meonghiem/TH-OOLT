package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

//import java.lang.Object;
public class Book extends Media{
	private List<String> authors = new ArrayList<String>();

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public Book() {
		super();
	}
	
	
	
	public Book(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, String category, List<String> authors){
		super(title, category);
		this.authors = authors; //TODO: check author condition
	} 

	public Book(String title, String category,float cost,ArrayList<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}
	public Book(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			return;
		}else {
			authors.add(authorName);
			return;
		}
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
			return;
		}
	}
	
}
