package hust.soict.hedspi.aims.media;

public class Media {
	private String title;
	private String category;
	private float cost;
	private int id;
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	public Media() {
		// TODO Auto-generated constructor stub
	}


	public Media(String title, String category) {
		this(title);
		this.category = category;
	}


	public Media(String title) {
		this.title = title;
	}
	
	public void printMedia() {
		System.out.print( " Title : "+title +" - "+ "Category : "+category +" - "+"Cost : "+ cost +" - "+"Id :"+id);
	}

}
