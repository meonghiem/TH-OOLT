package hust.soict.hedspi.aims.Aims;
import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Order;
public class Aims {
	
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
}
	
	

	
	public static void main(String[] args) {
		ArrayList <String> authors = new ArrayList<String>();
		authors.add("sugar daddy");
		authors.add("sugar baby");
		Book book1 = new Book("hands-on","Documentory",19.65f,authors);
		book1.setId(1001);
		Book book2 = new Book("math","Documentory",20.5f,authors);
		book2.setId(1002);
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc();
		dvd1.setTitle("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		dvd1.setId(10);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc();
		dvd2.setTitle("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		dvd2.setId(11);
		
		Scanner scanner = new Scanner(System.in);
		int choice; int id; int idItem;
		Order newOrder= null;
		ArrayList<Order> listOrder = new ArrayList<Order>();
		while(true) {
			showMenu();
			choice = scanner.nextInt();
			
			switch(choice) {
				case 1:
					newOrder = new Order();
					System.out.println("nhap id cua order");
					id = scanner.nextInt();
					newOrder.setId(id);
					listOrder.add(newOrder);
					break;
				case 2:
					
					assert newOrder.addMedia(book1): "cannot add media";
					break;
				case 3:
					System.out.println("nhap id muon xoa");
					idItem = scanner.nextInt();
					Media media1 = newOrder.findMediaById(idItem);
					assert newOrder.removeMedia(media1): "cannot remove media";
					break;
				case 4:
					System.out.println("display");
					System.out.println(newOrder.getItemsOrdered());
					System.out.println("display Order");
					for(Media media: newOrder.getItemsOrdered()) {
						media.printMedia();
					}
					break;
				case 0:
					scanner.close();
					System.exit(0);
				default:
					System.out.println("nhap sai, nhap lai");
					choice = scanner.nextInt();
					break;
			}
		}
		
		
	}
}